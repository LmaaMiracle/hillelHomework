package yarchuk;

public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Wrong amount!"); //***
        } else
            balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Wrong amount!"); //***
        } else if (balance < amount) {
            System.out.println("Not enough balance!");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

}
