package bleiweiss.ui;

import bleiweiss.business.Account;
import bleiweiss.business.CheckingAccount;
import bleiweiss.business.Transactions;

public class AccountApp {
    public static void main(String args[]) {
        String choice = "y";
        CheckingAccount checkingAccount = new CheckingAccount();

        Console.displayLine("Welcome to the Account Calculator");
        Console.displayLine();
        Console.displayLine("Starting Balance");
        Console.displayLine("Checking: " + checkingAccount.getBalanceFormatted());
        Console.displayLine();
        Console.displayLine("Enter the transactions for the month");
        Console.displayLine();

        while (choice.equals("y")) {
            String action = Console.getString("Withdrawal or deposit? (w/d): ");
            double amount = Console.getDouble("Amount: ");

            if (action.equals("w")) {
                double currentBalance = checkingAccount.getBalance();
                if (amount <= currentBalance){
                    Transactions.withdraw(checkingAccount, amount);
                } else {
                    Console.displayLine("Error: Cannot withdraw more than current account balance.");
                }

            } else if (action.equals("d")) {
                if (amount <= 10000){
                    Transactions.deposit(checkingAccount, amount);
                } else {
                    Console.displayLine("Error: Cannot deposit more than $10,000 per transaction.");
                }

            }

            Console.displayLine();
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }

        checkingAccount.subtractMonthlyFee();
        Console.displayLine();
        Console.displayLine("Monthly Fees");
        Console.displayLine("Checking fee:              " + checkingAccount.getMonthlyFeeFormatted());
        Console.displayLine();
        Console.displayLine("Final Balance");
        Console.displayLine("Checking: " + checkingAccount.getBalanceFormatted());


    }
}
