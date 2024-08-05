package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int turnCount = 1;

        while (totalScore < 20) {
            int turnScore = 0;
            boolean turnActive = true;
            System.out.println("TURN " + turnCount);

            while (turnActive) {
                System.out.print("Roll or hold? (r/h): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("r")) {
                    int die = random.nextInt(6) + 1;
                    System.out.println("Die: " + die);

                    if (die == 1) {
                        System.out.println("Turn over. No score.");
                        turnActive = false;
                    } else {
                        turnScore += die;
                        System.out.println("Turn score: " + turnScore);

                        // Check if turnScore >= 20 to declare a win
                        if (turnScore >= 20) {
                            totalScore += turnScore;
                            System.out.println("You won in " + turnCount + " turns!");
                            System.out.println("Total score: " + totalScore);
                            System.out.println("Game over! Congratulations!");
                            return; // Exit the program
                        }
                    }
                } else if (choice.equalsIgnoreCase("h")) {
                    totalScore += turnScore;
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + totalScore);
                    turnActive = false;
                } else {
                    System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
                }
            }

            turnCount++;
        }

        if (totalScore >= 20) {
            System.out.println("You won in " + turnCount + " turns!");
            System.out.println("Game over! Congratulations!");
        }

        scanner.close();
    }
}
