package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.RefactorPigDiceGame;

public class RefactorPigDiceGameTest {
    public static void main(String[] args) {
        RefactorPigDiceGameTest gameTest = new RefactorPigDiceGameTest();
        gameTest.startGame();
    }

    private void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        RefactorPigDiceGame game = new RefactorPigDiceGame();

        while (game.getTotalScore() < 20) {
            game.playTurn(scanner, random);
        }

        game.endGame();
        scanner.close();
    }
}
