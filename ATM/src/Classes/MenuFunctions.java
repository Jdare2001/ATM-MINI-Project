package Classes;

import java.util.Scanner;

public class MenuFunctions {
    public void startMenu(){
        boolean quit = false;
        Scanner theScanner = new Scanner(System.in);
        while(!quit){
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("Welcome to the bank of Java");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("What would you like to do?");
            System.out.println("1 - access account");
            System.out.println("2 - quit");
            String input;
            input = theScanner.next();

            switch(input){
                case "1":
                    break;
                case "2":
                    quit = true;
                    break;
                default:
                    System.out.println("please insert an appropriate answer");
            }
        }

    }
}
