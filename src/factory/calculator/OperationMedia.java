package factory.calculator;

import java.util.ArrayList;

public class OperationMedia implements Operation {
    private ArrayList<Integer> numbers;

    public OperationMedia(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void calculate() {
        System.out.println("Calculating media...");
        float result = 0f;
        for (Integer number : this.numbers) result += number;
        result = result / numbers.size();
        System.out.println("Media: " + result);
    }
}

