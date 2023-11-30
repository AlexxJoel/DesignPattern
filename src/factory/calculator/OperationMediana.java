package factory.calculator;

import java.util.ArrayList;

public class OperationMediana implements Operation {
    private ArrayList<Integer> numbers;

    public OperationMediana(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void calculate() {
        System.out.println("Calculating media...");
        float result = 0;
        // sort the array with quicksort
        //convert the arraylist to array
        int[] numbersArray = new int[this.numbers.size()];
        for (int i = 0; i < this.numbers.size(); i++) {
            numbersArray[i] = this.numbers.get(i);
        }
        //sort the array
        quickSort(numbersArray, 0, numbersArray.length - 1);
        //get the middle number
        int middle = numbersArray.length / 2;
        //check if the array is even
        if (numbersArray.length % 2 == 0) {
            //get the two middle numbers
            int middle1 = numbersArray[middle];
            int middle2 = numbersArray[middle - 1];
            //calculate the average
            result = (float) (middle1 + middle2) / 2;
        } else {
            //get the middle number
            result = numbersArray[middle + 1];
        }
        System.out.println("Mediana: " + result);
    }

    public void quickSort(int[] data, int begin , int end) {
        if (begin < end) {
            int partitionIndex = partition(data, begin, end);
            quickSort(data, begin, partitionIndex-1);
            quickSort(data, partitionIndex+1, end);
        }
    }

    public int partition(int[] data, int begin, int end) {
        int pivot = data[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (data[j] <= pivot) {
                i++;

                int swapTemp = data[i];
                data[i] = data[j];
                data[j] = swapTemp;
            }
        }

        int swapTemp = data[i+1];
        data[i+1] = data[end];
        data[end] = swapTemp;

        return i+1;
    }
}

