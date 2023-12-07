package factory.calculator;

import java.util.ArrayList;

abstract class Calculator {

    private Operation operation;
    private ArrayList<Integer> numbers;

    public Calculator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    /*
     @description
      This is the factory method.
     It's abstract cause subclasses will implement it,
     and they have responsibility to create the operation.
     */




    abstract Operation createOperation();

    public void initialize() {
        this.operation = createOperation();
        this.operation.calculate();
    }

    public ArrayList<Integer> getNumbers() {
        return this.numbers;
    }
}
