package com.aurionpro.behavioural.observer.test;

import com.aurionpro.behavioural.observer.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of accounts: ");
        int size = scanner.nextInt();

        Account[] accountList = new Account[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter your Account Number: ");
            long accountNumber = scanner.nextLong();

            System.out.println("Enter your name: ");
            String name = scanner.next();

            System.out.println("Enter your balance: ");
            double balance = scanner.nextDouble();

            Account account = new Account(accountNumber, name, balance);
            accountList[i] = account;
        }

        for (Account account : accountList) {
            boolean continueOperation = true;
            while (continueOperation) {
                System.out.println("Do you want to credit or debit? (Enter 'credit' or 'debit', or 'exit' to quit): ");
                String action = scanner.next();

                switch (action) {
                    case "credit":
                        System.out.println("Enter amount to credit: ");
                        double creditAmount = scanner.nextDouble();
                        account.credit(creditAmount);
                        break;

                    case "debit":
                        System.out.println("Enter amount to debit: ");
                        double debitAmount = scanner.nextDouble();
                        account.debit(debitAmount);
                        break;

                    case "exit":
                        continueOperation = false;
                        break;

                    default:
                        System.out.println("Invalid action. Please enter 'credit', 'debit', or 'exit'.");
                        continue;
                }

                // After the operation, ask for notification preferences
                System.out.println("Which types of notifications do you want? (Enter numbers separated by spaces): ");
                System.out.println("1. SMSNotifier");
                System.out.println("2. EmailNotifier");
                System.out.println("3. AppNotifier");
                System.out.println("Enter your choices: ");
                String[] choices = scanner.next().split(" ");

                // Clear existing notifiers and add new ones based on choices
//                account.notifierList.clear();
                for (String choice : choices) {
                    switch (choice) {
                        case "1":
                            account.addNotifier(new SMSNotifier());
                            break;
                        case "2":
                            account.addNotifier(new EmailNotifier());
                            break;
                        case "3":
                            account.addNotifier(new AppNotifier());
                            break;
                        default:
                            System.out.println("Invalid choice: " + choice);
                            break;
                    }
                }

                // Display updated account details
                account.display();

                // Send notifications based on the selected types
//                account.notifyAllNotifiers();
            }
        }

        scanner.close();
    }
}
