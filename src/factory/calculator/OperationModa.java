package factory.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class OperationModa implements Operation {
    private ArrayList<Integer> numbers;

    public OperationModa(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void calculate() {
        System.out.println("Calculating moda...");
        int moda = 0;
        int count[] = new int[]{0, 0};
        // loop for each number
        for (Integer number : this.numbers) {
            // loop for each number and count how many times it appears
            for (Integer number2 : this.numbers) {
                //check if the number2 is equal to the current number (i)
                if (number == number2) count[0]++;
            }

            if (count[0] > count[1]) {
                count[1] = count[0];
                moda = number;
            }
            count[0] = 0;
        }
        System.out.println("Moda: " + moda);
    }
}

