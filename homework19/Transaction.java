package yarchuk;

public class Transaction extends Thread {
    private TransactionType transactionType;
    private BankAccount bankAccount;
    private double amount;

    public enum TransactionType {
        DEPOSIT_MONEY(0), WITHDRAW_MONEY(1);

        TransactionType(int value) {
        }

    }

    public Transaction(BankAccount bankAccount, TransactionType transactionType, double amount) {
        this.transactionType = transactionType;
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public void run() {
        switch (this.transactionType) {
            case DEPOSIT_MONEY:
                depositAmount();
                printBalance();
                break;
            case WITHDRAW_MONEY:
                withdrawAmount();
                printBalance();
                break;
            default:
                throw new IllegalArgumentException("Invalid transaction.");
        }
    }

    public void depositAmount() {
        this.bankAccount.deposit(amount);
    }

    public void withdrawAmount() {
        this.bankAccount.withdraw(amount);
    }

    public void printBalance() {
        System.out.println(Thread.currentThread().getName() + " : TransactionType: " + transactionType + ", Amount: "
                + amount + "\n New Account Balance:" + bankAccount.getBalance() + "\n");
    }

}