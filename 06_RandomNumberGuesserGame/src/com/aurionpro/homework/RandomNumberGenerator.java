package com.aurionpro.homework;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            Random random1 = new Random();
            int minimum = 1, maximum = 100, count = 0;
            System.out.println("Hint --> Random Number is within " + minimum + " to " + maximum);
            int randomNumber = random1.nextInt(maximum - minimum + 1) + minimum;
            System.out.println(randomNumber);

            
            for (int i = 1; i <= 5; i++) {
                System.out.println("Guess the number?");
                int number = scanner.nextInt();

                if (number < randomNumber) {
                    System.out.println("Sorry, too low!!");
                    count++;
                } else if (number > randomNumber) {
                    System.out.println("Sorry, too high!!");
                    count++;
                } else {
                    System.out.println("------ You Won!! ------");
                    count++;
                    System.out.println("The tries you made to solve the game: " + count);
                    break;
                }

                
                if (i == 5) {
                    System.out.println("Game over! You've used all 5 attempts.");
                }
            }

            
            System.out.println("Do you want to play the game again? (yes/no)");
            answer = scanner.next();

            
            switch (answer.toLowerCase()) {
                case "yes":
                    break;
                case "no":
                    System.out.println("Thanks for playing! Goodbye.");
                    return;
                default:
                    System.out.println("Invalid response. Exiting the game.");
                    return;
            }

        } while (true); 
    }
}
