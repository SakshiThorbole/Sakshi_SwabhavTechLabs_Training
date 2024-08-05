//package com.aurionpro.test;
//
//import java.util.Scanner;
//
//import com.aurionpro.model.InputValidator;
//
//public class InputValidatorTest {
//	public static void main(String args[]) {
//		Scanner scanner=new Scanner(System.in);
//	    InputValidator validator= new InputValidator();
//	    
//	    
//	    System.out.println("Enter username: ");
//	    String username=scanner.next();
//	    checkUsername(username,validator);
//	    
//	    System.out.println("Enter password: ");
//	    String passowrd=scanner.next();
//	    checkPassword(passowrd,validator);
//	    
//	    System.out.println("Enter Email: ");
//	    String email=scanner.next();
//	    checkEmail(email,validator);
//	    
//	    
//	    
//	    
//	  }
//
//	  private static void checkEmail(String email, InputValidator validator) {
//	    if(!validator.validateEmail(email))
//	    {
//	      System.out.println("Email is invalid");
//	      return;
//	    }
//	    System.out.println("Email is valid");
//
//	    
//	  }
//
//	  private static void checkPassword(String password, InputValidator validator) {
//	    if(!validator.validatePassword(password))
//	    {
//	      System.out.println("Password is invalid");
//	      return;
//	    }
//	    System.out.println("Password is valid");
//	    
//	  }
//
//	  private static void checkUsername(String username,InputValidator validator) {
//	    if(!validator.validateUsername(username))
//	    {
//	      System.out.println("Username is invalid");
//	      return;
//	    }
//	    System.out.println("Username is valid");
//	  }
//
//	}