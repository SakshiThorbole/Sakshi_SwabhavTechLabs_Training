package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;
import com.aurionpro.model.Login;

public class LoginTest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Enter your email ID: ");
            String emailID = scanner.next();
            validateEmail(emailID);
            
            System.out.println("Enter your password: ");
            String password = scanner.next();    
            validatePassword(password);
            
            Login login = new Login(emailID, password);
            System.out.println(login);
            
        } catch (EmailNotValidException e) {
            System.out.println(e.getMessage());
        } catch (PasswordNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateEmail(String emailID) {
        if (!Login.validateEmail(emailID)) {
            throw new EmailNotValidException("Invalid email format: " + emailID);
        }
    }

    private static void validatePassword(String password) {
        if (!Login.validatePassword(password)) {
            throw new PasswordNotValidException("Password requirements not met: " + password);
        }
    }
}
