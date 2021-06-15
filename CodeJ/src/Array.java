import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("HEllo");
        System.out.println("Starting Array");

        //* Declare Array
        //elementType[] arrayRefVar;
        double[] myDoubleVal;
        myDoubleVal = new double[5];

        //Direct Declare
        int[] myNum = new int[10];

        //Initialize Array
        myNum[2] = 5;

        //length
        System.out.println(myNum.length);

        //printArray
        System.out.println(myNum[2]);

        //Take input from User
        //Scanner input=new Scanner(System.in);
        String input = "5";

        //Direct conver and store int/Double
        //myDoubleVal[2]=input.nextDouble();
        myDoubleVal[2] = Integer.valueOf(input);

        //Generate Random value with range 0 to N
        System.out.println(Math.random() * 10);

        //Finding the smallest index of the largest element:
        int[] myNumbers = {1, 5, 3, 4, 5, 2, 0};
        double max = myNumbers[0];
        int indexOfMax = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers[i] > max) {
                max = myNumbers[i];
                indexOfMax = i;
            }
        }
        System.out.println("Index: " + indexOfMax + " Max Number: " + max);

        //Randon Suffle
        int temp;
        for(int i=0;i<myNumbers.length;i++){
            int r=(int) Math.random() * myNumbers.length;
            temp=myNumbers[i];
            myNumbers[i]=myNumbers[r];
            myNumbers[r]=temp;
        }

        //shift the elements lef to rright
        int firstIndex=myNumbers[0];
        for(int i=1;i<myNumbers.length;i++){
            myNumbers[i-1]=myNumbers[i];
        }
        myNumbers[myNumbers.length-1]=firstIndex;

        //Deck Card create and suffle then show 1st 3 card !!!
        System.out.println("Deck Card");
        int[] deck=new int[52];
        String[] suits={"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","J","Queen","King"};
            //Creating Card
        for(int i=0;i<deck.length;i++){
            deck[i]=i;
        }
            //Suffel Cards
        for(int i=0;i<deck.length;i++){
            int r=(int) (Math.random() * deck.length);
            int tempCard=deck[i];
            deck[i]=deck[r];
            deck[r]=tempCard;
        }
            //Print first 3 card
        for(int i=0;i<3;i++){
            //System.out.println("Number: "+deck[i]);
            int suit=deck[i]/13;
            int rank=deck[i]%13;
            System.out.println("Card: "+suits[suit]+" "+ranks[rank]);
        }

        //Copy Array and pointing to diff memory
            //using Loop
        int[] x={1,2,3,4,5,6,10};
        int[] y=new int[x.length];
        for(int i=0;i<x.length;i++){
            y[i]=x[i];
        }
            //Copy Array Using Class
        int[] z = new int[x.length];
        java.lang.System.arraycopy(x,0,z,0,x.length);
        for(int i:z){
            System.out.println(i);
        }

        //Calling method with parameter array
        printArray(new int[]{3, 1, 2, 6, 4, 2});

        //primitive data type Will not change.
        //array will change as pointing to same reference | arrayList,arry is reference data Type
    }
    //printArray method
    public static void printArray(int[] array){
        for(int i:array) System.out.println(i);
    }
}