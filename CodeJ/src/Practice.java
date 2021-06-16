import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
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

    }

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
