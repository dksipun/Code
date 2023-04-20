import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
class Practice{
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name="ABCD";
        System.out.println(10/1);
        int[] arr = {10, -1, 20, 4, 5, -9, -6};

    }
    public static int[] findsum(int[] arr,int n){
        int[] result=new int[2];
        int[] sarr=sortarr(arr);
        int l=0;
        int r=arr.length-1;
        while (l<r){
            int sum=sarr[l]+sarr[r];
            if(sum==n){
                result[0]=sarr[l];
                result[1]=sarr[r];
                return result;
            }
            if(sum<n){
                l++;
            }else {
                r++;
            }
        }
        return result;
    }
    public static void permutation(String name,String ans){
        if(name.length()==0){
            System.out.println(ans);
        }
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            String l=name.substring(0,i);
            String r=name.substring(i+1);
            String roq=l+r;
            permutation(roq,ans+ch);
        }

    }
    public static void subsq(String[] list,String ans){
        if(list.length==0) {
            System.out.println(ans);
            return;
        }
        String ch=list[0];
        subsq(Arrays.copyOfRange(list,1,list.length),ans+ch);
        subsq(Arrays.copyOfRange(list,1,list.length),ans+"");
    }
    public static void subsq1(String name,String ans){
        if(name.length()==0) {
            System.out.println(ans);
            return;
        }
        char ch= name.charAt(0);
        String roq=name.substring(1);
        subsq1(roq,ans+"");
        subsq1(roq,ans+ch);
    }
    public static int[] sortarr(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid=arr.length / 2;
        int[] left=sortarr(Arrays.copyOfRange(arr,0,mid));
        int[] right=sortarr(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
        int l=0;
        int r=0;
        int index=0;
        while (l<left.length && r<right.length){
            if(left[l]<right[r]){
                result[index++]=left[l++];
            }else {
                result[index++]=right[r++];
            }
        }
        while (l<left.length){
            result[index++]=left[l++];
        }
        while (r<right.length){
            result[index++]=right[r++];
        }
        return result;
    }
}