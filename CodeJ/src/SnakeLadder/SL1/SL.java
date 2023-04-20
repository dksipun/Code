package SnakeLadder.SL1;

import java.util.HashMap;
public class SL {
    private String[] board;
    private HashMap<Integer,Integer> snakes;
    private HashMap<Integer,Integer> ladders;
    private int boardSize;

    public SL(){
        this.boardSize=100;
        this.board=new String[this.boardSize];
        this.snakes=new HashMap<>();
        this.ladders=new HashMap<>();
    }
    public SL(int ownSize){
        this.boardSize=ownSize;
        this.board=new String[this.boardSize];
        this.snakes=new HashMap<>();
        this.ladders=new HashMap<>();
    }
    public void createBoard(){
        for(int i=0;i<100;i++){
            this.board[i]=String.valueOf(i+1);
        }
    }
    public void getBoard(){
        for(String b:board){
            System.out.println(b);
        }
    }

    public void addSnakes(int head,int tail){
        head--;
        tail--;
        if(addSnakesRules(head,tail)){
            this.snakes.put(head,tail);
            this.board[head]="s";
            System.out.println("Snake added: "+head+" -> "+tail);
        }
    }
    public void addLadders(int start,int end){
        start--;
        end--;
        if(addLadderRules(start,end)){
            ladders.put(start,end);
            System.out.println("Ladder added: "+start+" -> "+end);
            this.board[start]="l";
        }
    }

    public boolean addSnakesRules(int head,int tail){
        if(head>tail && head <this.boardSize && tail>1 && !this.board[head].equals("s") && !this.board[head].equals("l") && !this.board[tail].equals("l") && !this.board[tail].equals("s")){
            return true;
        }
        System.out.println("Not added Snake: "+head+" -> "+tail);
        return false;
    }
    public boolean addLadderRules(int start,int end){
        if(start<end && end<=100 && start>1  && !this.board[start].equals("s") && !this.board[start].equals("l") && !this.board[end].equals("s") && !this.board[end].equals("l")){
            return true;
        }
        System.out.println("Not added Ladder: "+start+" -> "+end);
        return false;
    }

    public int getNewScore(int number){
        int num=number-1;
        //System.out.println(this.board[num]);
        //System.out.println(board[num]);
        if (this.board[num].equals("s")){
            return snakes.get(num);
        }else if(this.board[num].equals("l")){
            return ladders.get(num);
        }
        return number;
//        if (board[num].equals("s")){
//            return getNewScore(snakes.get(num));
//        }else if(board[num].equals("l")){
//            return getNewScore(ladders.get(num));
//        }
//        return num;
    }


}
