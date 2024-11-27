package Penalty;

public class runner {
    public static void main(String[] args) {
        BasicBankAccount basicBankAccount = new BasicBankAccount(5000.0);

        basicBankAccount.withdraw(5100);
        System.out.println(basicBankAccount);
    }
}
