package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    // Function to calculate square root
    public static double squareRoot(double x) {
        if (x<0) {
            System.out.println("This calculator defines square root only for positive numbers.");
            logger.warn("Negative number given for square root");
            return -1.0;
        }
        return Math.sqrt(x);
    }

    // Function to calculate factorial
    public static long factorial(int x) {
        if (x < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            logger.warn("Negative number given for factorial");
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate natural logarithm
    public static double naturalLog(double x) {
        if (x <= 0) {
            System.out.println("Natural logarithm is only defined for positive numbers.");
            logger.warn("Non positive number given for natural log");
            return -1;
        }
        return Math.log(x);
    }

    // Function to calculate power
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // just a comment for checking if ngrok works or not.

    public static void main(String[] args) {
        logger.info("Start of calculator program");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Menu display
            System.out.println("\n--- Scientific Calculator Menu ---");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Square Root
                    System.out.print("Enter a number: ");
                    double numSqrt = scanner.nextDouble();
                    logger.info("Start of square root function");
                    System.out.println("√" + numSqrt + " = " + squareRoot(numSqrt));
                    logger.info("End of square root function");
                    break;

                case 2: // Factorial
                    System.out.print("Enter an integer: ");
                    int numFact = scanner.nextInt();
                    logger.info("Start of factorial function");
                    long factResult = factorial(numFact);
                    logger.info("End of factorial function");
                    if (factResult != -1) {
                        System.out.println(numFact + "! = " + factResult);
                    }
                    break;

                case 3: // Natural Logarithm
                    System.out.print("Enter a number: ");
                    double numLog = scanner.nextDouble();
                    logger.info("Start of natural log function");
                    double logResult = naturalLog(numLog);
                    logger.info("End of natural log function");
                    if (logResult != -1) {
                        System.out.println("ln(" + numLog + ") = " + logResult);
                    }
                    break;

                case 4: // Power
                    System.out.print("Enter the base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    double exponent = scanner.nextDouble();
                    logger.info("Start of Power function");
                    System.out.println(base + "^" + exponent + " = " + power(base, exponent));
                    logger.info("End of Power function");
                    break;

                case 5: // Exit
                    System.out.println("Exiting the calculator. Goodbye!");
                    logger.info("Ending calculator program");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    logger.warn("Invalid choice input");
            }

        } while (choice != 5);

        scanner.close();
    }
}