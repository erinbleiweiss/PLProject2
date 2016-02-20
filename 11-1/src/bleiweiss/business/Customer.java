package bleiweiss.business;

public class Customer extends Person{

    private int customerNum;

    public Customer(){
        super();
        customerNum = 0;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public String getDisplayText(){
        return super.toString() + "\nCustomer number: " + getCustomerNum();
    }

}


