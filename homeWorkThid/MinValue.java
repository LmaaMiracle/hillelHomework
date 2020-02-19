package yarchuk;

public class MinValue {

    public int getMinValue(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
