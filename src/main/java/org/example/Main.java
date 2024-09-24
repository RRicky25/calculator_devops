package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    // Function to calculate square root
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    // Function to calculate factorial
    public static long factorial(int x) {
        if (x < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
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
            return -1;
        }
        return Math.log(x);
    }

    // Function to calculate power
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello ricky. welcome back");
        System.out.println(factorial(5));
//        int choice;
//        do {
//            // Menu display
//            System.out.println("\n--- Scientific Calculator Menu ---");
//            System.out.println("1. Square Root (√x)");
//            System.out.println("2. Factorial (x!)");
//            System.out.println("3. Natural Logarithm (ln(x))");
//            System.out.println("4. Power (x^b)");
//            System.out.println("5. Exit");
//            System.out.print("Choose an option: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1: // Square Root
//                    System.out.print("Enter a number: ");
//                    double numSqrt = scanner.nextDouble();
//                    System.out.println("√" + numSqrt + " = " + squareRoot(numSqrt));
//                    break;
//
//                case 2: // Factorial
//                    System.out.print("Enter an integer: ");
//                    int numFact = scanner.nextInt();
//                    long factResult = factorial(numFact);
//                    if (factResult != -1) {
//                        System.out.println(numFact + "! = " + factResult);
//                    }
//                    break;
//
//                case 3: // Natural Logarithm
//                    System.out.print("Enter a number: ");
//                    double numLog = scanner.nextDouble();
//                    double logResult = naturalLog(numLog);
//                    if (logResult != -1) {
//                        System.out.println("ln(" + numLog + ") = " + logResult);
//                    }
//                    break;
//
//                case 4: // Power
//                    System.out.print("Enter the base (x): ");
//                    double base = scanner.nextDouble();
//                    System.out.print("Enter the exponent (b): ");
//                    double exponent = scanner.nextDouble();
//                    System.out.println(base + "^" + exponent + " = " + power(base, exponent));
//                    break;
//
//                case 5: // Exit
//                    System.out.println("Exiting the calculator. Goodbye!");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//
//        } while (choice != 5);

        scanner.close();
    }
}