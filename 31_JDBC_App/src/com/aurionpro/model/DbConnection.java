package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public void connectToDb() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");   // Load the MySQL JDBC driver

            // Establish the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/orgranization", "root", "root");
            System.out.println("Connection Successful");
            
            
            getDepartmentDetails();   // Get and display data

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
        } 
    }

    public void getDepartmentDetails() {
        ResultSet resultSet = null;
        try {
            
            statement = connection.createStatement();    // Create a statement

            resultSet = statement.executeQuery("SELECT * FROM department");  // Execute a query

            while (resultSet.next()) {           // Process the result set
                System.out.println(resultSet.getInt("departmentNo") + " " + resultSet.getString("departmentName") + " " + resultSet.getString("departmentLocation"));
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving data.");
            e.printStackTrace();
        }
    }

    public void addDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Department No: ");
        int departmentNumber = scanner.nextInt();
     
        System.out.println("Enter Department name: ");
        String departmentName = scanner.next();
     
        System.out.println("Enter location: ");
        String departmentLocation = scanner.next();
     
        try {
            // Use PreparedStatement to execute the insert
            preparedStatement = connection.prepareStatement("INSERT INTO department VALUES (?, ?, ?)");
            preparedStatement.setInt(1, departmentNumber);
            preparedStatement.setString(2, departmentName);
            preparedStatement.setString(3, departmentLocation);
            preparedStatement.executeUpdate();
         
            System.out.println("Record Inserted");
         
        } catch(SQLException e) {
            e.printStackTrace();
        } 
    }
}
