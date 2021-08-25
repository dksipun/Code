import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Tail R");
        int num=5;
        int result=1;
        System.out.println(f(num,result));

    }
    public static int f(int num,int result){
        if(num==1){
            return result;
        }else {
            //result*=num;
            return f(num-1,result*num);
        }
    }

    public static int fibTail(int num,int result){
        if(num==1){
            return 1;
        }
        else if(num==0){
            return 0;
        }
        else {
            return result;
        }

    }
}
