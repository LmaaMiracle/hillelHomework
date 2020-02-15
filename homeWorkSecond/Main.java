package yarchuk;

public class Main {

    public static void main(String[] args) {
        double[] array = {1, 2.5, 5, 13.2};

        AverageValueCalculator test = new AverageValueCalculator();

        //расчет среднего арифметического двух чисел
        System.out.println(test.averageValueOfTwoNumbers(4, 5));

        //расчет среднего арифметического произвольного количества чисел
        System.out.println(test.averageValue(array));

        //пример программы для расчета депозита
        BankDeposit bankDeposit = new BankDeposit();
        bankDeposit.deposit(1430.5, 5, 5);

    }
}
