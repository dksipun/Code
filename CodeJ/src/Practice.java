import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        int[] xoo={1,2,4};
        changeArray(xoo);
        System.out.println(xoo[0]);//1
        System.out.println(xoo[1]);//15
    }
    public static void changeArray(int[] x){
        x[1]=15;
        int[] y=new int[x.length];
        x=y;
        x[0]=20;
    }
}
