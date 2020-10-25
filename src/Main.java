package src;// Adam Phelps
// Banking Java app

import java.util.Scanner;

public class Main {
    private boolean runGame = true;
    private String userContinueResponse;

    public void set_runGame(boolean runGame) {
        this.runGame = runGame;
    }

    public void runGame()
    {
        Account MyAccount = new Account();
        MyAccount.set_owner();
        while (runGame == true) {
            MyAccount.user_start_transaction();
            System.out.println(MyAccount.return_funds());
            Scanner input = new Scanner(System.in);
            System.out.print("Do what you continue adding or removing funds? (Yes/y/No/n)");
            userContinueResponse = input.next();
            if (userContinueResponse.equals("Yes") || userContinueResponse.equals("y")) {
                set_runGame(true);
            }
            else if (userContinueResponse.equals("No") || userContinueResponse.equals("n")) {
                set_runGame(false);
            }
            else {
                System.out.println("Unknown input, aborting.");
                set_runGame(false);
            }
        }
    }

    public static void main(String[] args)
    {
        Main MyMain = new Main();
        MyMain.runGame();
    }
}