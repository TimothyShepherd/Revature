package Day5;

import java.util.Scanner;

public class Emily{
    public static void main(String[] args) throws InterruptedException{

        Scanner scanner = new Scanner(System.in);

        // Program greeting
        System.out.println("Hello! I'm EMIly.");

        Thread.sleep(1500);

        System.out.println("\n" + "I'm your EMI assistant.");

        Thread.sleep(1500);

        // Take user input
        System.out.println("\n" + "Tell me the amount of the loan: ");
        double loanAmount = scanner.nextDouble();

        System.out.println("\n" + "You entered: " + loanAmount);

        Thread.sleep(1500);

        System.out.println("\n" + "Tell me what the interest rate is: ");
        double loanRate = scanner.nextDouble();

        System.out.println("\n" + "You entered: " + loanRate + "%");

        Thread.sleep(1500);

        System.out.println("\n" + "What is the duration of the loan in months?");
        int loanDuration = scanner.nextInt();

        System.out.println("\n" + "You entered: " + loanDuration);

        Thread.sleep(1500);

        // Perform calculation
        double ratePercentage = loanRate / (12*100);
        double EMI = (loanAmount * ratePercentage * Math.pow(1 + ratePercentage, loanDuration) /
                Math.pow(1 + ratePercentage, loanDuration) - 1);

        // Output result
        System.out.println("\n" + "Your EMI is: " + EMI);

        Thread.sleep(1500);

        System.out.println("\n" + "Goodbye!");
    }
}
