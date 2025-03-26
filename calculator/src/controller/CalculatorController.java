package controller;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        if (model == null || view == null) {
            throw new IllegalArgumentException("Model and View cannot be null");
        }
        this.model = model;
        this.view = view;
    }

    public void calculate() {
        try {
            int firstNumber = view.getFirstNumber();
            int secondNumber = view.getSecondNumber();
            char operation = view.getOperation();

            switch (operation) {
                case '+' -> model.add(firstNumber, secondNumber);
                case '-' -> model.subtract(firstNumber, secondNumber);
                case '*' -> model.multiply(firstNumber, secondNumber);
                case '/' -> {
                    if (secondNumber == 0) {
                        view.displayError("Cannot divide by zero");
                        return;
                    }
                    model.divide(firstNumber, secondNumber);
                }
                default -> {
                    view.displayError("Invalid operation");
                    return;
                }
            }

            view.displayResult(model.getResult());

        } catch (NumberFormatException e) {
            view.displayError("Invalid number format");
        } catch (Exception e) {
            view.displayError(e.getMessage());
        }
    }
}
