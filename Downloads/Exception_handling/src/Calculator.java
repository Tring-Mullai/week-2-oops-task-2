package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            int a = ab.nextInt();

            System.out.println("Enter the second number: ");
            int b = ab.nextInt();

            int c = dividenum(a, b);
            System.out.println("The result is: " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input");
        } 
        finally {
            System.out.println("The program has been executed successfully.");
        }
    }

    public static int dividenum(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not possible.");
        } else {
            return a / b;
        }
    }
}


