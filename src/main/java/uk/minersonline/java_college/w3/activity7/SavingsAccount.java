package uk.minersonline.java_college.w3.activity7;

public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (balance > 100) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("The back account balance must not be less than 100.");
        }
    }
}
