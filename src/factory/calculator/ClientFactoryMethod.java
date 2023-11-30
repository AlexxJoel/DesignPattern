package factory.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class ClientFactoryMethod {

    public static void main(String[] args) {

        //data for calculator with arraylist filled with numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("numbers = " + numbers + " size = " + numbers.size());

        // create calculator for media
        Calculator calculatorMedia = new CalculatorMedia(numbers);
        calculatorMedia.initialize();

        // create calculator for moda
        Calculator calculatorModa = new CalculatorModa(numbers);
        calculatorModa.initialize();

        // create calculator for mediana
        Calculator calculatorMediana = new CalculatorMediana(numbers);
        calculatorMediana.initialize();





    }
}
