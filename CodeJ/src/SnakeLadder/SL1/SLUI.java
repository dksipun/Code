package SnakeLadder.SL1;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class SLUI {
    private SL myGame;
    private ArrayList<SLPerson> persons;

    public SLUI(SL myGame){
        this.myGame=myGame;
        this.persons=new ArrayList<SLPerson>();
    }

    public void start(){
        if (prepareBoard()){
            System.out.println("Board is Preparted .. Lets Play");
            gamePlay();
        }
    }
    public void gamePlay(){
        while (true){
            boolean Flag=true;
            for(SLPerson p:persons){
                play(p,myGame);
                if(p.getScore()==100){
                    Flag=false;
                    break;
                }
            }
            if (Flag==false){
                break;
            }
        }
    }

    public boolean prepareBoard(){
        boolean Flag1=true;
        myGame.createBoard();
        try(Scanner read=new Scanner(Paths.get("/Users/debasis.parida/Documents/JAVA/Code/CodeJ/src/a.txt"))){
            int inputType=3;
            int CurrentNum=0;
            while (read.hasNextLine()){
                boolean Flag=true;
                String row=read.nextLine();
                if(CurrentNum==0 && inputType==3){
                    CurrentNum+=Integer.valueOf(row);
                    Flag=false;
                }
                if(CurrentNum==0 && inputType==2){
                    CurrentNum+=Integer.valueOf(row);
                    Flag=false;
                }
                if(CurrentNum==0 && inputType==1){
                    CurrentNum+=Integer.valueOf(row);
                    Flag=false;
                }

                if(inputType==3 && CurrentNum!=0 && Flag==true){
                    int head=Integer.valueOf(row.split(" ")[0]);
                    int tail=Integer.valueOf(row.split(" ")[1]);
                    myGame.addSnakes(head,tail);
                    CurrentNum--;
                    if(CurrentNum==0){
                        inputType--;
                        Flag=false;
                    }
                }
                if(inputType==2 && CurrentNum!=0 && Flag==true){
                    int start=Integer.valueOf(row.split(" ")[0]);
                    int end=Integer.valueOf(row.split(" ")[1]);
                    myGame.addLadders(start,end);
                    CurrentNum--;
                    if(CurrentNum==0){
                        inputType--;
                        Flag=false;
                    }
                }
                if(inputType==1 && CurrentNum!=0 && Flag==true){
                    SLPerson rw=new SLPerson(row);
                    CurrentNum--;
                    persons.add(new SLPerson(row));
                }
            }
        }catch (Exception e){
            System.out.println("Error::::"+ e.getMessage());
            Flag1=false;

        }
        return Flag1;
    }

    public void play(SLPerson person,SL game){
        int tempScore=person.getScore();
        int Maxtry=3;
        while (true) {
            int dice=person.rollDice();
            if(dice==6 && Maxtry!=0){
                Maxtry--;
                printReport(dice,person,game);
                if(tempScore==person.getScore()){
                    break;
                }
            }else if(dice==6 && Maxtry==0){
                System.out.println(person.getPersonName() + " rolled a" + dice + " and moved from " + person.getScore() + " to " + tempScore);
                person.updateScore(tempScore);
                break;
            }else if(dice!=6 && Maxtry!=3) {
                int newScore = newScore(dice,person,game);
                if (newScore == 100) {
                    System.out.println(person.getPersonName() + " wins the game");
                }else {
                    System.out.println(person.getPersonName() + " rolled a dice " + dice + " and moved from " +  person.getScore() + " to " + tempScore);
                    person.updateScore(tempScore);
                }
                break;
            }
            else {
                printReport(dice,person,game);
                break;
            }
        }
    }
    public int newScore(int diceScore,SLPerson person,SL game){
        if (person.getScore()+diceScore==100 && diceScore==6){
            return person.getScore();
        }
        if(person.getScore()+diceScore<=100) {
            int newScore = game.getNewScore(person.getScore() + diceScore);
            return newScore;
        }
        return person.getScore();
    }
    public void printReport(int dice,SLPerson person,SL game){
        int newScore=newScore(dice,person,game);
        if (newScore == 100) {
            System.out.println(person.getPersonName() + " rolled a dice " + dice + " and moved from " + person.getScore() + " to " + newScore);
            System.out.println(person.getPersonName() + " wins the game");
            person.updateScore(100);
        } else {
            System.out.println(person.getPersonName() + " rolled a dice " + dice + " and moved from " + person.getScore() + " to " + newScore);
            person.updateScore(newScore);
        }
    }

}
