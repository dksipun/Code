public class Recursive_3 {
    public static void main(String[] args){
        System.out.println("Recursion....");
        //One or more base cases (the simplest case) are used to stop recursion.
        // Every recursive call reduces the original problem, bringing it increasingly close to a base case until it becomes that case.
        //In general, recursion can be used to solve the inherent recursive problems such as Tower of Hanoi, recursive directories, and Sierpinski triangles.

        //3.1 Factorial 0!=1;2!=2*1*1
        System.out.println("Factorial of 3 is: "+factorial(3));

        //3.2 Print num , keep divide it with 10 .. print unitl >0
        recPrintUntil0(1000);

        //3.3 print //6+5+4+3+2+1+0:21
        recPrint(6);

        //3.4 The Fibonacci series 0 + 1 1 2 3 5 8 13 fib(Index) =fib(Index-2) + fib(Index-1)
        int indexf=6;
        System.out.println(fib(indexf));
            //With ForLoop
        int previousLast=0;   // 0 1 1 2 3 5 8 13
        int previous=1;
        int temp=0;
        for(int i=2;i<=indexf;i++){      //2//0 1 | 1 1
            temp=previousLast;          //3//1 1 | 1 2
            previousLast=previous;      //4//1 2 | 2 3
            previous=temp+previous;     //5//2 3 | 3 5
        }                               //6//3 5 | 5 8
        if(indexf==0) previous=0;
        System.out.println("Index: "+indexf+" : "+previous); //8

        //3.6 Print and learn with recursion
        reMethodPrint(5); //5+4+3+2+1+0+1+2+3+4+5

        //3.7 // it's a tail recursion // isPalendrom
            // A tail-recursive method has no pending operations after a recursive call.
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindromeAdvance("mom",0,"mom".length()-1));

        //3.8 Recursion sort
        int[] x={4,2,1,5,1,0,5};
        recursiveSort(x,0,7);

        //3.9 BinarySearch with recursion
        int[] lst = {1, 2, 3, 5, 6, 8};
        System.out.println(bsearch(lst,6,0,lst.length-1));

        //Factorial with Tail Recursion // auxiliary method it will call again the same method
        System.out.println(factorialTailR(4));


    }

    //3.1 Factorial
    public static long factorial(int num){
        if(num==0){
            return 1;   // Base case    without this //StackOverflowError
        }else {
            return num * factorial(num-1);  // Recursive call
        }
    }

    //3.2
    public static void recPrintUntil0(int num){
        System.out.println("Num: "+num);
        if(num>0){
            System.out.println("/ "+num/10);
            recPrintUntil0(num/10);
        }
    }

    //3.3 print rec num and sum of that
    public static int recPrint(int num) {
        if (num > 0) {
            System.out.print(num+"+");
            return num + recPrint(num - 1);
        }
        System.out.print("0:");
        return 0;
    }

    //3.5 fibonacci series // Not good as it will call multiple time same number with recursion method
    public static int fib(int num){
        if(num==0) return 0;
        else if(num==1) return 1;
        else return fib(num-2)+fib(num-1);
    }

    //3.6 Print with rec
    public static void reMethodPrint(int num){
        if(num>0){
            System.out.print(num+"+");
            reMethodPrint(num-1);
            if(num==5) System.out.print(num);
            else System.out.print(num+"+");
        }
        else System.out.print("0+");
    }

    //3.7 Palindrome //it's a tail recursion
    public static boolean isPalindrome(String x) {
        //System.out.println(x);
        if (x.length() == 1 || x.length() == 0) {
            return true;
        } else if (x.split("")[0].equals(x.split("")[x.length() - 1])) {
            return isPalindrome(x.substring(1, x.length() - 1));
        } else {
            System.out.println(x.split("")[0] + " : " + x.split("")[x.length() - 1]);
            return false;
        }
    }

    //3.7 Advance with index passing
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

    //3.8 Recursion Sort
    public static void recursiveSort(int[] list,int low,int high){
        if(low<high) {
            int min=list[low];
            int minIndex=low;
            for (int i = low + 1; i <high;i++){
                if(list[i]<min){
                    min=list[i];
                    minIndex=i;
                }
            }
            list[minIndex]=list[low];
            list[low]=min;

            recursiveSort(list,low+1,high);
        }
    }

    //3.9 Bsearch recursive
    public static int bsearch(int[] list,int num,int low,int high) {
        int mid = (low + high) / 2;
        if (low >= high) {
            System.out.println("Not present");
            return -low-1;
        }
        if (list[mid] == num) {
            System.out.println("Got the num");
            return list[mid];
        }else if (num > list[mid]) {
            return bsearch(list, num, mid + 1, high);
        } else {
            return bsearch(list, num, low, mid - 1);
        }
    }

    //3.10 ComputeFactorialTailRecursion
    public static int factorialTailR(int num){
        return factorialTailR(num,1);
    }
    public static int factorialTailR(int num,int result) {
        if (num == 1) {
            return result;
        } else {
            return factorialTailR(num - 1, num * result);
        }
    }

    //Fibonaci series with Tail REcursion

    //String permutation


}
