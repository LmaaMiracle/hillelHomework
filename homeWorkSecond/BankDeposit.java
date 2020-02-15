package yarchuk;

public class BankDeposit {

    public void deposit(double amount, double percentPerYear, int duration) {
        if (amount <= 0 || percentPerYear <= 0 || duration <= 0) {
            throw new IllegalArgumentException("Invalid data");
        }

        double sum = amount;
        for (int i = 0; i < duration; i++) {
            sum += (amount * percentPerYear) / 100;
            System.out.println("Сумма накопленных денег за " + (i + 1) + " год составляет " + sum);
        }

        System.out.println("Накопленная сумма денег: " + sum);
        System.out.println("Сумма % по вкладу составляет: " + (sum - amount));
    }

}
