package Classes;

import java.util.Scanner;

public class MenuFunctions {
    Scanner theScanner = new Scanner(System.in);
    public void startMenu(){
        boolean quit = false;

        while(!quit){
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("Welcome to the bank of Java");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("What would you like to do?");
            System.out.println("1 - access / create account");
            System.out.println("2 - quit");
            String input = theScanner.next();
            switch(input){
                case "1":
                    accessAccountMenu();
                    break;
                case "2":
                    quit = true;
                    break;
                default:
                    System.out.println("please insert an appropriate answer");
            }
        }

    }
    private void accessAccountMenu(){
        boolean goBack = false;
        String accountName;
        String password;
        while(!goBack){
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("What would you like to do?");
            System.out.println("1 - access existing account");
            System.out.println("2 - add a new account");
            System.out.println("3 - Go back");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            String input = theScanner.next();
            switch(input){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    goBack = true;
                    break;
                default:
                    System.out.println("please insert an appropriate answer");
            }


        }

    }
    private void addAccountMenu(){

    }
}
