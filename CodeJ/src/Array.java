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
        int i1=0,i2=5,i3=6;

        //Initialize Array
        myNum[2] = 5;

        //printArray
        System.out.println(myNum[2]); //5

        //Array[] and List are Reference type[Non Primitive] will use same reference memory
        int[] cloneNum=myNum;
        cloneNum[2]=6;
        System.out.println(myNum[2]); // 6

        //length
        System.out.println(myNum.length);

        //Clone Array
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
            //arraycopy(sourceArray, srcPos, targetArray, tarPos, sourceArray.length);
            //primitive data type Will not change.
            //array will change as pointing to same reference | arrayList,arry is reference data Type

        //Take input from User
            //Scanner input=new Scanner(System.in);
        String input = "5";

        //Direct convert and store int/Double
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

        //Reverse Array
        reverse(new int[]{3, 1, 2, 6, 4, 2});

        //Generate 20 char Array and count of each char
            //From (char) 97 small char a starting to 97+26
        char[] chars=createArray(20);
        System.out.println(chars);
        int[] counts=countLetter(chars);
            //Print 5 at a time
        displayCount(counts);

        //Change method Array
        int[] xoo={1,2,4};
        changeArray(xoo);
        System.out.println(xoo[0]);//1
        System.out.println(xoo[1]);//15

        //7.8 elips
        ellipsis(1,2,3,4,5);//here z is array


    }
    //printArray method
    public static void printArray(int[] array){
        for(int i:array) System.out.println(i);
    }

    //ReturnReverse
    int[] rR=returnReverse(new int[]{3, 1, 2, 6, 4, 2});

    //Reverse Array
    public static void reverse(int[] list){
        for(int i=0;i<list.length/2;i++){   //(int i=0,j=list.length-1; i<j;i++,j--)
            int temp=list[i];
            list[i]=list[list.length-1-i];
            list[list.length-1-i]=temp;
        }
    }

    //ReturnReverse
    public static int[] returnReverse(int[] list){
        int[] result=new int[list.length];
        for(int i=0,j=result.length-1; i<list.length;i++,j--){
            result[j]=list[i];
        }
        return result;
    }

    //Create CharArry and then Count repetative char and then print It
    public static char[] createArray(int len){
        char[] chars=new char[len];
        for(int i=0;i<chars.length;i++){
            chars[i]=(char)((Math.random() *26)+97);
        }
        return chars;
    }
    public static void displayCount(int[] counts){
        for(int i=0;i<counts.length;i++){
            if((i+1) % 5==0) System.out.println((char) (i +97)+":"+counts[i]);
            else System.out.print((char) (i +97)+":"+counts[i]+" ");
        }
    }
    public static int[] countLetter(char[] chars){
        int[] counts=new int[26];
        for(int i=0;i<chars.length;i++){
            counts[chars[i]-'a']++;
        }
        return counts;
    }

    //Change method Array
    public static void changeArray(int[] x){
        x[1]=15;
        int[] y=new int[x.length];
        x=y;
        x[0]=20;
    }

    //7.8 ellipsis
    public static void ellipsis(int a,int b,int...z){
        System.out.println(a);
        System.out.println(b);
        //z[0]=3 z[1]=4;
    }
}