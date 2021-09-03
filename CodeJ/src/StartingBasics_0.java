import java.util.ArrayList;
import java.util.Scanner;

public class StartingBasics_0 {
    public static void main(String[] args){
        System.out.println("ArrayList/ Read Input / If..Else / For /For Each / While / Method ");

        Scanner input=new Scanner(System.in);
        //String x=input.nextLine();
        ArrayList<Integer> list=new ArrayList<>();

        int num=4;
        //If..Else
        if(num > 2){
            System.out.println(num+": is bigger than 2");
        }else {
            System.out.println(num+": is smaler than 2");
        }

        int[] numbers = {100,  1,  42,  23,  1,  1, 3200, 3201};
        //For
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
            list.add(numbers[i]);
        }
        //For each
        for(int i:list){
            System.out.println(i);
        }
        //For
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //While
        int i=0;
        while( i < list.size()){
            System.out.println(list.get(i));
            i++;
        }
        //Method Calling
        System.out.println("Calling method");
        printList(list);

        //Return Print and declare
        System.out.println(returnNum());
        int x=returnNum();
        System.out.println(x);
        System.out.println(numbers);
        System.out.println(list);
    }

    //Methods HEre
    public static void printList(ArrayList l){
        for(Object i:l){
            System.out.println(i);
        }
    }
    public static int returnNum(){
        return 10;
    }
}
