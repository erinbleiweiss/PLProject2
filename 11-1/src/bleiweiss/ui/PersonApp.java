package bleiweiss.ui;

import bleiweiss.business.*;
import java.util.Scanner;

public class PersonApp {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Person Tester application");
        System.out.print("Create customer or employee? (c/e): ");
        String choice = sc.nextLine();

        if (choice.equals("c")) {
            Customer c = new Customer();

            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            c.setFirstName(firstName);

            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            c.setLastName(lastName);

            System.out.print("Enter email address: ");
            String email = sc.nextLine();
            c.setEmail(email);

            System.out.print("Customer number: ");
            String custNum = sc.nextLine();
            c.setCustomerNum(custNum);

        } else if (choice.equals("e")) {
            Employee e = new Employee();

            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            e.setFirstName(firstName);

            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            e.setLastName(lastName);

            System.out.print("Enter email address: ");
            String email = sc.nextLine();
            e.setEmail(email);

            System.out.print("Customer number: ");
            String custNum = sc.nextLine();
            e.set(custNum);

        }


    }


}
