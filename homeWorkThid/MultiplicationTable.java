package yarchuk;

import java.util.Scanner;

public class MultiplicationTable {

    public void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to get table");

        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
