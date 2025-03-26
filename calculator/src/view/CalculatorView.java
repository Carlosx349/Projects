package view;

import java.util.Scanner;

public class CalculatorView {
    private final Scanner scanner = new Scanner(System.in);

    public int getFirstNumber() {
        System.out.print("Enter first number: ");
        return scanner.nextInt();
    }

    public int getSecondNumber() {
        System.out.print("Enter second number: ");
        return scanner.nextInt();
    }

    public char getOperation() {
        System.out.print("Enter operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void displayResult(int result) {
        System.out.println("Result: " + result);
    }

    public void displayError(String message) {
        System.out.println("Error: " + message);
    }
}

