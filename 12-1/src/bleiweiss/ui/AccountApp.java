package bleiweiss.ui;

import bleiweiss.business.Account;
import bleiweiss.business.CheckingAccount;
import bleiweiss.business.Transactions;

public class AccountApp {
    public static void main(String args[]) {
        String choice = "y";
        Account account = new Account();
        CheckingAccount checkingAccount = new CheckingAccount();

        Console.displayLine("Welcome to the Account Calculator");
        Console.displayLine();
        Console.displayLine("Starting Balance");
        Console.displayLine("Checking: " + account.getBalanceFormatted());
        Console.displayLine();
        Console.displayLine("Enter the transactions for the month");
        Console.displayLine();

        while (choice.equals("y")) {
            Transactions transaction = new Transactions();
            String action = Console.getString("Withdrawal or deposit? (w/d): ");
            double amount = Console.getDouble("Amount: ");

            if (action.equals("w")) {
                transaction.withdraw(account, amount);

            } else if (action.equals("d")) {
                transaction.deposit(account, amount);

            }

            choice = Console.getString("Continue? (y/n): ");
        }

        Console.displayLine("Monthly Fees");
        Console.displayLine("Checking fee:              " + checkingAccount.getMonthlyFeeFormatted());
        Console.displayLine();
        Console.displayLine("Final Balance");
        Console.displayLine("Checking: " + account.getBalanceFormatted());


    }
}
