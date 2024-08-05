package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class RefactorPigDiceGame {

    private int totalScore = 0;
    private int turnScore = 0;
    private int turnCount = 0; 

    public int getTotalScore() {
        return totalScore;
    }

    public void playTurn(Scanner scanner, Random random) {
        turnScore = 0;
        boolean turnActive = true;
        turnCount++; 

        System.out.println("TURN " + turnCount);

        while (turnActive) {
            turnActive = takeTurn(scanner, random);
        }
    }

    private boolean takeTurn(Scanner scanner, Random random) {
        System.out.print("Roll or hold? (r/h): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("r")) {
            return rollDie(random);
        }

        if (choice.equalsIgnoreCase("h")) {
            holdTurn();
            return false;
        }

        System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
        return true;
    }

    private boolean rollDie(Random random) {
        int die = random.nextInt(6) + 1;
        System.out.println("Die: " + die);

        if (die == 1) {
            System.out.println("Turn over. No score.");
            return false;
        }

        turnScore = turnScore + die;
        System.out.println("Turn score: " + turnScore);

        if (totalScore + turnScore >= 20) {
            totalScore += turnScore;
            System.out.println("You won with a total score of " + totalScore + " in turn " + turnCount + "!");
            System.out.println("Game over! Congratulations!");
            System.exit(0);
        }

        return true;
    }

    private void holdTurn() {
        totalScore += turnScore;
        System.out.println("Score for turn: " + turnScore);
        System.out.println("Total score: " + totalScore);
    }

    public void endGame() {
        System.out.println("You won in " + turnCount + " turns!");
        System.out.println("Game over! Congratulations!");
    }
}
