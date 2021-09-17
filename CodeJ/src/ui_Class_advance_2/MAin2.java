package ui_Class_advance_2;

import java.util.Scanner;

public class MAin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics2 grade=new GradeStatistics2();
        // Write your program here -- consider breaking the program into
        // multiple classes.

        UI2 r=new UI2(grade,scanner);
        r.start();

    }
}
