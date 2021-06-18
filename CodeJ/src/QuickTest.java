public class QuickTest {
    public static void main(String[] args){
        System.out.println("Quick test small code");
        String x="momm";
        //System.out.println(x);
        //System.out.println(x.substring(0,x.length()));

        System.out.println(isPalindromeAdvance(x,0,x.length()-1));
    }
    public static boolean isPalindrome(String x){
        //System.out.println(x);
        if(x.length()==1 || x.length()==0) {
            return true;
        }
        else if(x.split("")[0] .equals (x.split("")[x.length()-1])){
            return isPalindrome(x.substring(1,x.length()-1));
            }
        else {
            System.out.println(x.split("")[0]+" : "+x.split("")[x.length()-1]);
            return false;
        }
    }

    public static boolean isPalindromeAdvance(String s,int low,int high){
        if (high <= low){
            return true;
        }
        else if((s.charAt(low) != s.charAt(high))) {
            System.out.println(s.charAt(low)+" : "+s.charAt(high));
            return false;
        }
        else{
            return isPalindromeAdvance(s, low + 1, high-1 );
        }
    }

}
