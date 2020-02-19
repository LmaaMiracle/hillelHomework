package yarchuk;

public class AverageValueOfArray {

    public double averageValue(double[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

}
