public class QuickTest {
    public static void main(String[] args){
        int num=7;
        String w="malyalam";
        //System.out.println(f(num));
        //System.out.println(facto(5,1));
        System.out.println(pali(w,0,w.length()-1));

    }
    public static int f(int num){
        System.out.println("Fibo");
        int firstValue=0;
        int secondValue=1;
        int result=0;

        for(int i=1;i<=num;i++){
            result=firstValue+secondValue;
            firstValue=secondValue;
            secondValue=result;
        }
        return result;
    }

    public static int facto(int num,int result){
        if(num==1){
            return result;
        }
        else{
            return facto(num-1,result*num);
        }
    }

    public static boolean pali(String word,int fast,int last){
        if(fast>=last){
            System.out.println("Palindrom");
            return true;
        }else if(word.charAt(fast) != word.charAt(last)){
            System.out.println("Not Palindrom");
            return false;
        }else {
            return pali(word,fast+1,last-1);
        }
    }
}
