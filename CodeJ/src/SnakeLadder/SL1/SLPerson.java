package SnakeLadder.SL1;

public class SLPerson extends SL{
    private String name;
    private int score;
    //private int tempScore;

    public SLPerson(String name){
        this.name=name;
    }

    public int getScore(){
        return this.score;
    }
    public String getPersonName(){
        return this.name;
    }
    public void updateScore(int score){
        this.score=score;
    }

    public void play(){
        System.out.println("Started Playing");
        System.out.println(this.name+" :Current Score: "+this.score);

    }

    public int rollDice(){
        int num=(int)(Math.random()*5);
        return num+1;
    }


}
