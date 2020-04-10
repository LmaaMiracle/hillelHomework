package yarchuk;

import java.util.List;

public class BubbleSort {

    public List<Double> bubbleSort(List<Double> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    double temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public double[] bubbleSort(double[] array) {

        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    double temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


}
