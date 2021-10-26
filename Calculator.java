package Day5;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        System.out.println("Hello," + "\n");
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("My name is Cal." + "\n" + "I'm your personal calculator." + "\n");
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Let's get started!" + "\n");
        System.out.println("Enter First Number: ");
        Scanner scanner1 = new Scanner(System.in);
        double amount1 = scanner1.nextInt();
        System.out.println("\n" + "You entered: " + amount1 + "\n");
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Enter Second Number: ");
        Scanner scanner2 = new Scanner(System.in);
        double amount2 = scanner2.nextInt();
        System.out.println("\n" + "You entered: " + amount2 + "\n");
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Good...");
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Now," + "\n");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Select Option: " + "\n" + "1 - Add" + "\n" + "2 - Subtact" + "\n" + "3 - Multiply" + "\n" + "4 - Divide");
        Scanner scanner3 = new Scanner(System.in);
        int selection = scanner3.nextInt();
        if(selection == 1){
            System.out.println("\n" + "Addition Result: " + (amount1 + amount2));
        }else if(selection == 2){
            System.out.println("\n" + "Subtraction Result: " + (amount1 - amount2));
        }else if(selection == 3){
            System.out.println("\n" + "Multiplication Result: " + (amount1 * amount2));
        }else if(selection == 4){
            System.out.println("\n" + "Division Result: " + (amount1 / amount2));
            System.out.println("Remainder = " + (amount1 % amount2));
        }else{
            System.out.println("Not a valid selection.");
        }
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("\n" + "Goodbye!");
    }
}
