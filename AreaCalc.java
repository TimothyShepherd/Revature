package Day6;

import java.util.Scanner;

public class AreaCalc{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the length for the rectangle: ");
        double x = input.nextInt();
        System.out.println("You entered: " + x);

        System.out.println("Please input the width for the rectangle: ");
        double y = input.nextInt();
        System.out.println("You entered: " + y);

        int rectArea = (int) (x * y);
        System.out.println("The area of the rectangle is: " + rectArea);
    }
}
