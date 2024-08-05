package com.aurionpro.violation.test;

import com.aurionpro.violation.model.Labour;
import com.aurionpro.violation.model.Robot;
import com.aurionpro.violation.model.IWorker;

public class WorkerTest {

    public static void main(String[] args) {
        IWorker labour = new Labour();
        IWorker robot = new Robot();

        System.out.println("Labour:");
        labour.startWork();
        labour.stopWork();
        labour.eat();
        labour.drink();

        System.out.println("Robot:");
        robot.startWork();
        robot.stopWork();
        robot.eat();  
        robot.drink();  
    }
}
