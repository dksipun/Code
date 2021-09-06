package ui_interface_advance_2;

import java.util.Scanner;

public class UI2 {
    private GradeStatistics2 result;
    private Scanner scanner;


    public UI2(GradeStatistics2 result,Scanner scanner){
        this.result=result;
        this.scanner=scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String read = scanner.nextLine();
            int num = Integer.valueOf(read);

            if (num == -1) {
                System.out.println(result.avg());
                result.getGrade();
                break;
            } else if (num > 0 && num < 100) {
                result.add(num);
                result.addstar(num);
            }
        }
    }
}
