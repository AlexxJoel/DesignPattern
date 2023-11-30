package factory.calculator;

import java.util.ArrayList;

public class CalculatorMediana extends Calculator {

    public CalculatorMediana(ArrayList<Integer> numbers) {
        super(numbers);
    }

    @Override
    Operation createOperation() {
        ArrayList<Integer> numbers = this.getNumbers();
        if (numbers == null) return null;
        return new OperationMediana(numbers);
    }
}
