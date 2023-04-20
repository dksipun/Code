import java.util.ArrayList;
import java.util.Scanner;

public class QuickTest{
    public static void main(String[] args){
        System.out.println("Hello");
        int[] x=new int[4];
        System.out.println(x[0]+x[1]+1);
        System.out.println(x[0]==0);
    }
    public static void permutation(String name,String ans){
        if(name.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<name.length();i++){
            String left="";
            String right="";
            permutation(left+right,ans+name.split("")[i]);
        }

    }

}