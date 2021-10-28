package Day6;

import java.io.IOException;
import java.util.Scanner;

class Average{

    int a, b, c;

    float result;

    public void averaged(){

        result = (a + b + c) / 3f;
    }
}

class AverageCalc{
    public static void main (String args[]) throws IOException, ArithmeticException{

        Scanner sc = new Scanner(System.in);
        // Creates an instance of the Average class as an object named average.
        Average average = new Average();

        System.out.println("Enter Three Values: ");

        // Takes user input 3 times and stores it in average object integers.
        average.a = sc.nextInt();
        average.b = sc.nextInt();
        average.c = sc.nextInt();

        // Call the average method to average the numbers.
        average.averaged();

        // Prints the result.
        System.out.println(average.result);
    }
};