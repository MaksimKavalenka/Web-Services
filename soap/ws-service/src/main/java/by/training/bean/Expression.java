package by.training.bean;

import java.io.Serializable;

import by.training.enumeration.Operation;

public class Expression implements Serializable {

    private static final long serialVersionUID = -171117348370011489L;

    private double            number1;
    private double            number2;
    private Operation         operation;

    public Expression() {
    }

    public Expression(final double number1, final double number2, final Operation operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(final double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(final double number2) {
        this.number2 = number2;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(final Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[number1:" + number1 + "number2:" + number2 + "operation:"
                + operation.name() + "]";
    }

}
