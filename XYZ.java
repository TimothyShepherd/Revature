package Day6;

import java.util.Scanner;

public class XYZ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String getName = sc.nextLine();

        System.out.println("Please enter your roll number: ");
        int getRollNumber = sc.nextInt();

        System.out.println("Please enter your field of interest: ");
        String getInterest = sc.next();

        System.out.println("Your message is: " + "\n");
        System.out.println("Hey, my name is: " + getName + " and my roll number is: " + getRollNumber + ". "
        + "My field of interest is: " + getInterest);
    }
}
