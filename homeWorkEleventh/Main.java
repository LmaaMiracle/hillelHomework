package yarchuk;

import java.util.ArrayList;

public class Main {

    enum Car {
        NIVA, NEXIA, KIA
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(null);
        System.out.println(arrayList.get(0));

        String sql = """
                SELECET name, marks
                FROM Student
                WHERE group = "AI-182"
                AND id = 2
                """;

        Car car;

        var automobile = switch (car) {
            case NIVA -> System.out.println("Niva");
            case NEXIA -> System.out.println("Nexia");
        };

        Object obj = "Sanya";

        if (obj instanceof String s){
            System.out.println(s.length());
        }


    }
}
