package bleiweiss.ui;

import bleiweiss.business.*;

public class PersonApp {

    public static void main(String args[]) {

        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();
        String choice = Console.getString("Create customer or employee? (c/e): ");

        if (choice.equals("c")) {
            Customer c = new Customer();

            String firstName = Console.getString("Enter first name: ");
            c.setFirstName(firstName);

            String lastName = Console.getString("Enter last name: ");
            c.setLastName(lastName);

            String email = Console.getString("Enter email address: ");
            c.setEmail(email);

            String customerNum = Console.getString("Customer number: ");
            c.setCustomerNum(customerNum);

            print(c);

        } else if (choice.equals("e")) {
            Employee e = new Employee();

            String firstName = Console.getString("Enter first name: ");
            e.setFirstName(firstName);

            String lastName = Console.getString("Enter last name: ");
            e.setLastName(lastName);

            String email = Console.getString("Enter email address: ");
            e.setEmail(email);

            String ssn = Console.getString("Social security number: ");
            e.setSsn(ssn);

            print(e);
        }

    }

    public static void print(Person p) {
        System.out.println("You entered:");
        System.out.print(p.getDisplayText());
    }

}
