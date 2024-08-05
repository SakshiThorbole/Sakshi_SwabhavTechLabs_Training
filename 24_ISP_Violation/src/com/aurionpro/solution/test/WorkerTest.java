package com.aurionpro.solution.test;

import com.aurionpro.solution.model.*;

public class WorkerTest {
    public static void main(String[] args) {
        
        Labour labour = new Labour();
        Robot robot = new Robot();

        
        System.out.println("Testing Labour:");
        labour.startWork();
        labour.eat();
        labour.drink();
        labour.stopWork();

        
        System.out.println("\nTesting Robot:");
        robot.startWork();
        robot.stopWork();
    }
}
