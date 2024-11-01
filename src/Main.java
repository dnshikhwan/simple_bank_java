/*
1. Account with a balance []
2. Deposit and withdraw and funds []
3. Check their balance []
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        //instantiate new account object
        Account account = new Account(name, 1000);

        //print name
        System.out.println("Hi, " + account.getName());

        boolean flag = true;
        while (flag) {
            System.out.println("Please choose a command (1. Deposit, 2. Withdraw, 3. Check balance, 4. Exit)");
            int command = 0;

            try {
                command = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scanner.next();
                continue;
            }

            float amount = 0.0F;

            switch (command) {
                case 1:
                    System.out.println("How many you want to deposit?");
                    amount = scanner.nextFloat();
                    account.deposit(amount);
                    System.out.println("Balance: RM" + account.checkBalance());
                    System.out.println("---DONE---");
                    break;
                case 2:
                    System.out.println("How many you want to withdraw?");
                    amount = scanner.nextFloat();
                    account.withdraw(amount);
                    System.out.println("Balance: RM" + account.checkBalance());
                    System.out.println("---DONE---");
                    break;
                case 3:
                    System.out.println("Balance: RM" + account.checkBalance());
                    System.out.println("---DONE---");
                    break;
                case 4:
                    System.out.println("---BYE---");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }

        scanner.close();
    }
}