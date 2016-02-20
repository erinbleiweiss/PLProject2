package bleiweiss.business;

import java.text.NumberFormat;

public class CheckingAccount extends Account{

    private double monthlyFee;

    public CheckingAccount() {
        super();
        this.monthlyFee = 1.0;
    }

    public void subtractMonthlyFee(){
        setBalance(getBalance() - getMonthlyFee());
    }

    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee(){
        return monthlyFee;
    }

    public String getMonthlyFeeFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getMonthlyFee());
    }


}
