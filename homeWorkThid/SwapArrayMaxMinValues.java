package yarchuk;

public class SwapArrayMaxMinValues {

    public double[] swapMaxMin(double[] array) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < array[minIndex])
                minIndex = i;
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }

        double temp;
        if (maxIndex != minIndex) {
            temp = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = temp;
        }
        return array;
    }
}