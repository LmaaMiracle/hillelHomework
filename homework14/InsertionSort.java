package yarchuk;

public class InsertionSort {

    public double[] insertionSort(double[] array) {

        for (int i = 1; i < array.length; i++) {
            double key = array[i];
            int j = i - 1;

            while (j > -1 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

}
