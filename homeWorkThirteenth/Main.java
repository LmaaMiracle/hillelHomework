package yarchuk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        AverageValueOfList averageValueOfList = new AverageValueOfList();
        PairsOfStrings pairs = new PairsOfStrings();
        LowercaseString lowercaseString = new LowercaseString();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("jdbc");
        strings.add("c");
        strings.add("d");
        strings.add("five");
        strings.add("Star");

        list.add(2);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(31);

        System.out.println(averageValueOfList.getAverageValueOfList(list));
        System.out.println(pairs.getPairOfString(strings));
        System.out.println(lowercaseString.filetListOfString(strings));


    }
}
