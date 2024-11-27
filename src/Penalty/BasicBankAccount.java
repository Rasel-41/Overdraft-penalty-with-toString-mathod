package Penalty;

public class BasicBankAccount extends BankAccount{
    private  final double penalty = 30.0;
    BasicBankAccount(double balance){
        super(balance);
    }

    @Override
    public void withdraw(double amount) {

        if(amount>balance){
            System.out.println("Overdraft");
            balance = balance - amount - penalty;
        }else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Current balnce of BasicBankAccount : " + " $" +balance;
    }
}
