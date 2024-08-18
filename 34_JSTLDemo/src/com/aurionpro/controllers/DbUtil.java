package com.aurionpro.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Student;

public class DbUtil {
    private Connection connection;
    private static DbUtil dbUtil;

    private DbUtil() {}

    public static DbUtil getDbUtil() {
        if (dbUtil == null)
            dbUtil = new DbUtil();
        return dbUtil;
    }

    public void connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
            System.out.println("Connection Successful");
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students";

        try (Statement statement = connection.createStatement(); 
             ResultSet dbStudents = statement.executeQuery(query)) {
            while (dbStudents.next()) {
                students.add(new Student(dbStudents.getInt(1), dbStudents.getString(2), dbStudents.getDouble(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}
