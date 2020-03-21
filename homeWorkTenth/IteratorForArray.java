package yarchuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorForArray<T> implements Iterable<T> {
    private T[] array;
    private int arraysLength;

    private int index = 0;
    private boolean check = true;

    public IteratorForArray(T[] array) {
        this.array = array;
        this.arraysLength = array.length;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return index < arraysLength;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No elements in array");
                }
                check = false;
                return array[index++];
            }

            @Override
            public void remove() {
                if (check) {
                    throw new IllegalStateException("You should call for next() method first");
                }

                if (index < arraysLength) {
                    System.arraycopy(array, index + 1, array, index, arraysLength - index - 1);
                    array = Arrays.copyOf(array, array.length - 1);
                }
                arraysLength--;
                check = true;
            }
        };
    }
}
