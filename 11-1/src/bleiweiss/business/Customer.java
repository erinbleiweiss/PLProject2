package bleiweiss.business;

public class Customer extends Person{

    private String customerNum;

    public Customer(){
        super();
        customerNum = "";
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public String getDisplayText(){
        return super.toString() + "\nCustomer number: " + getCustomerNum();
    }

}


