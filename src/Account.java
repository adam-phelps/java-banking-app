package src;

import java.util.Scanner;

public class Account {
    private float accountBalance = 1000;
    private String accountOwner = "";

    public String set_owner() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the Account Owner First Name");
        return input.next();
    }

    public float return_funds() {
        return accountBalance;
    }

    public void add_funds(float cashAmount) {
        accountBalance = accountBalance + cashAmount;
    }

    public void remove_funds(float cashAmount) {
        accountBalance = accountBalance - cashAmount;
    }

    public void user_get_value(float cashAmount, String transactionType) {
        if (transactionType.equals("Add")) {
            add_funds(cashAmount);
        }
        else if (transactionType.equals("Remove")) {
            remove_funds(cashAmount);
        }
    }

    public void user_start_transaction() {
        System.out.print("Do you want to (Add) or (Remove) value?");
        Scanner input = new Scanner(System.in);
        String userResponse = input.next();
        System.out.print("How much?");
        String userTransactionAmount = input.next();
        float transactionCashAmount = Float.parseFloat(userTransactionAmount);
        switch (userResponse) {
            case ("Add"):
            case ("Remove"):
                user_get_value(transactionCashAmount, userResponse);
                break;
            default:
                break;
        }
    }
}
