package model;

public class CalculatorModel {
    private int result;

    public void add(int a, int b) {
        result = a + b;
    }

    public void subtract(int a, int b) {
        result = a - b;
    }

    public void multiply(int a, int b) {
        result = a * b;
    }

    public void divide(int a, int b) {
        if (b != 0) {
            result = a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public int getResult() {
        return result;
    }
}

