package src;

import java.util.Scanner;

public class Account {
    private float accountBalance = 0;
    private String accountOwner = "";

    private static String set_owner()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the Account Owner First Name");
        return input.next();
    }

    public Account() {
        accountOwner = set_owner();
        System.out.println(accountOwner);
    }
}
