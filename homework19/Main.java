package yarchuk;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(100);

        for (int i = 0; i < 10; i++) {
            Thread deposit = new Thread(new Transaction(bankAccount, Transaction.TransactionType.DEPOSIT_MONEY, 100));
            deposit.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread withdraw = new Thread(new Transaction(bankAccount, Transaction.TransactionType.WITHDRAW_MONEY, 50));
            withdraw.start();
        }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        // Expected account balance is 5000
        System.out.println("Final Account Balance: " + bankAccount.getBalance());

    }
}
