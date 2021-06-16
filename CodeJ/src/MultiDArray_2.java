import java.util.Arrays;
import java.util.Scanner;

public class MultiDArray_2 {
    public static void main(String[] args){
        System.out.println(" MultiDimentionalArray | Matrix | Table | Nested Array");
        // elementType[][] arrayRefVar;

        //Declare
        int[][] matrix;

        //Create
        matrix=new int[5][5];

        //Initiate
        matrix[0][0]=1;

        //Direct declare ,Create and Initiate //ragged array
        int[][] table = { {1, 3}, {4, 1, 3, 6}, {7, 8, 9}, {12}};

        //If you don’t know the values in a ragged array in advance
        int[][] triangleArray = new int[3][];
        triangleArray[0] = new int[5];
        triangleArray[1] = new int[4];
        triangleArray[2] = new int[3];

        //Initial matrix of int[][] m = new int[5][5];
        int[][] m = new int[5][5];
            //Scanner input=new Scanner(System.in);
        for(int row=0;row<m.length;row++){
            for(int column=0;column<m[row].length;column++){
                //m[row][column]=input.nextInt();
                m[row][column]=(int)(Math.random() * 100); //random values between 0 and 99
            }
        }

        //print the 2D array
        for(int row=0;row<m.length;row++){
            System.out.println(Arrays.toString(m[row]));
            for(int column=0;column<m[row].length;column++){
                System.out.print(m[row][column]+" ");
            }
            System.out.println("");
        }

        //Shuffling the matrix
        for(int row=0;row<m.length;row++){
            for(int column=0;column<m[row].length;column++){
                int i=(int)(Math.random() * m.length);
                int j=(int)(Math.random() * m[i].length);
                int temp=m[row][column];
                m[row][column]=m[i][j];
                m[i][j]=temp;
            }
        }

        //8.1 Student mark count and get topper from 8 studets answer sheet sAnswer.
        char[][] sAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] qAns = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] studentsResult=getResult(sAnswers,qAns);
        printResult(studentsResult);

        //Sortest Distance{{x1,y1},{x2,y2}} = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)

        //sudoku game check

    }

    //8.1
    public static int[] getResult(char[][] sAnswers,char[] qAns){
        int[] students=new int[8];
        for (int row = 0; row < sAnswers.length; row++) {
            for (int column = 0; column < sAnswers[row].length; column++) {
                if (sAnswers[row][column] == qAns[column]) {
                    students[row]++;
                }
            }
        }
        return students;
    }
    public static void printResult(int[] result){
        int rank1=0;
        int sname=0;
        for(int i=0;i<result.length;i++){
            System.out.println("Student "+i+" :"+ result[i]);
            if(result[i]>rank1){
                rank1=result[i];
                sname=i;
            }
        }
        System.out.println("Top1: Student"+sname+" Mark: "+rank1);
    }

}
