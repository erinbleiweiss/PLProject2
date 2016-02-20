package bleiweiss.business;

import bleiweiss.account.interfaces.Balanceable;
import bleiweiss.account.interfaces.Depositable;
import bleiweiss.account.interfaces.Withdrawable;

import java.text.NumberFormat;

public class Account implements Balanceable, Depositable, Withdrawable {

    public Account() {
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void setBalance(double amount) {

    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    public String getBalanceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getBalance());
    }

}
