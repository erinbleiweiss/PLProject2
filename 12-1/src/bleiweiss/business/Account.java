package bleiweiss.business;

import bleiweiss.account.interfaces.Balanceable;
import bleiweiss.account.interfaces.Depositable;
import bleiweiss.account.interfaces.Withdrawable;

import java.text.NumberFormat;

public class Account implements Balanceable, Depositable, Withdrawable {

    private double balance;

    public Account() {
        this.balance = 1000.0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double amount) {
        this.balance = amount;

    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public String getBalanceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getBalance());
    }

}
