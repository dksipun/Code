package ui_Class_1;

import java.util.Scanner;

public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner){
        this.scanner=scanner;
        this.todolist=todolist;
    }

    public void start(){
        while (true){
            System.out.println("Command:");
            String word=scanner.nextLine();
            if(word.equals("stop")){
                break;
            }else if(word.equals("add")){
                System.out.println("To add:");
                this.todolist.add(scanner.nextLine());
            }else if(word.equals("list")){
                this.todolist.print();
            }else if(word.equals("remove")){
                System.out.println("Which one is removed?");
                int num=Integer.valueOf(scanner.nextLine());
                this.todolist.remove(num);
            }
        }
    }
}

