import java.util.ArrayList;
import java.util.Scanner;

public class QuickTest{
    public static void main(String[] args){
        System.out.println("Hello");

        double[] xx=new double[3];
        int[] xxx;
        xxx= new int[3];
        int[] tt=new int[3];
        int t1=0,t3=4,t4=2;

        Scanner input=new Scanner(System.in);
        //String x=input.nextLine();
        System.out.println("");

        ArrayList<Integer> list=new ArrayList<>();

        int a=4;
        if(a>5){
            System.out.println("Gretter");
        }else {
            System.out.println("Smaller");
        }

        int[] num={1,3,5,6,7,8};
        for(int i=0;i<num.length;i++){
            //System.out.println(num[i]);
            list.add(num[i]);
            //list.get(i);
        }
        for(int i:num){
            //System.out.println(i);
        }
        System.out.println(list);
        int i=0;
        while (i<list.size()){
            //System.out.println(list.get(i));
            i+=1;
        }

        printList(list);
        System.out.println(returnNum());

    }
    public static void printList(ArrayList x){
        for(Object i:x){
            System.out.println(i);
        }
    }
    public static int returnNum(){
        return 10;
    }
}