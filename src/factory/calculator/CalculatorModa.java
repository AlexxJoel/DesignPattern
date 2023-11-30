package factory.calculator;

import java.util.ArrayList;

public class CalculatorModa extends Calculator{

    public CalculatorModa(ArrayList<Integer> numbers) {
        super(numbers);
    }

    @Override
    Operation createOperation() {
        ArrayList<Integer> numbers = this.getNumbers();
        if(numbers == null) return null;
        return new OperationModa(numbers);
    }
}
