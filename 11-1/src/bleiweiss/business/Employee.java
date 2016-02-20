package bleiweiss.business;

public class Employee {

    private String ssn;

    public Employee(){
        super();
        ssn = "";
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDisplayText(){
        return super.toString() + "\nSocial security number: " + getSsn();
    }

}
