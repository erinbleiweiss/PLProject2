package bleiweiss.business;

import java.text.NumberFormat;

public class CheckingAccount extends Account{

    private double monthlyFee;

    public CheckingAccount() {
        super();
        this.monthlyFee = 1.0;
    }

    public void subtractMonthlyFee(){

    }

    public void setMonthlyFee(double monthlyFee){

    }

    public double getMonthlyFee(){

    }

    public String getMonthlyFeeFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getMonthlyFee());
    }


}
