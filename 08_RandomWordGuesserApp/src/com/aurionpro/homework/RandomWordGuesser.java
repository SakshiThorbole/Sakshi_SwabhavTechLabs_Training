package com.aurionpro.homework;

import java.util.*;

public class RandomWordGuesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"programming", "java", "hangman", "computer", "developer"};
        boolean playAgain = true;

        while (playAgain) {
            String wordToGuess = words[random.nextInt(words.length)];
            char[] guessedWord = new char[wordToGuess.length()];
            Arrays.fill(guessedWord, '_');
            int lives = 6;
            boolean won = false;

            System.out.println("Welcome to Word Guesser!");

            while (lives > 0 && !won) {
                System.out.println("Current word: " + String.valueOf(guessedWord));
                System.out.print("Guess a letter: ");
                char guess = sc.next().charAt(0);
                boolean correctGuess = false;

                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        guessedWord[i] = guess;
                        correctGuess = true;
                    }
                }

                if (!correctGuess) {
                    lives--;
                    System.out.println("Wrong guess. You have " + lives + " lives left.");
                } else {
                    System.out.println("Good guess!");
                }

                if (String.valueOf(guessedWord).equals(wordToGuess)) {
                    won = true;
                }
            }

            if (won) {
                System.out.println("Congratulations! You've guessed the word: " + wordToGuess);
            } else {
                System.out.println("Game over! The word was: " + wordToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing Hangman!");
    }
}

