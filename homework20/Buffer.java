package yarchuk;

import java.util.LinkedList;

public class Buffer {
    private static final LinkedList<Integer> list = new LinkedList<>();
    private static int capacity = 5;

    public static LinkedList<Integer> getList() {
        return list;
    }

    public static boolean isFull() {
        return list.size() == capacity;
    }

    public static boolean isEmpty() {
        return list.size() == 0;
    }

}
