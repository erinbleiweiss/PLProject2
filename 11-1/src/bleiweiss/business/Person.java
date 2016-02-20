package bleiweiss.business;

public abstract class Person {

    String firstName;
    String lastName;
    String email;

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() +
                "\nEmail: " + getEmail();
    }

    public abstract String getDisplayText();
    
}
