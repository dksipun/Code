import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        int[] a={1,2};
        System.out.println("A:"+a[0]+" B:"+a[1]);
        swap(a[0],a[1]);
        System.out.println("A:"+a[0]+" B:"+a[1]);
        swapArray(a);
        System.out.println("A:"+a[0]+" B:"+a[1]);
    }
    public static void swap(int n1,int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
    }
    public static void swapArray(int[] x){
        int temp=x[0];
        x[0]=x[1];
        x[1]=temp;
    }
}
