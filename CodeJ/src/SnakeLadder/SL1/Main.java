package SnakeLadder.SL1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Snake and Ladder Game");
        SL myGame=new SL();

        SLUI GameUI=new SLUI(myGame);
        GameUI.start();
    }
}
