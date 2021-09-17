package ui_Class_advance_2;

import java.util.Scanner;

public class MAinProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        System.out.println("<-------- Object in an Instance variable");
        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
