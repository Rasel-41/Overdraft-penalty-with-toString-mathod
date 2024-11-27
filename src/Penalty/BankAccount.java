package Penalty;

public class BankAccount {
  protected double balance;

    BankAccount(double initialBalance){
       balance= initialBalance;
    }
    public void diposit(double amount){
        if(amount>0) {
            balance = balance + amount;
        }

    }
    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
