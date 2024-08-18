package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/passbook")
public class PassbookController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DbUtil dbUtil;

    @Override
    public void init() throws ServletException {
        dbUtil = DbUtil.getDbUtil();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        Integer customerId = (Integer) session.getAttribute("customer_id");

        if (customerId == null) {
            request.setAttribute("errorMessage", "You must be logged in to view transactions.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
            dispatcher.forward(request, response);
            return;
        }

        String sql = "SELECT * FROM transaction WHERE sender_account_id IN (SELECT account_number FROM bankaccount WHERE customer_id = ?) OR receiver_account_id IN (SELECT account_number FROM bankaccount WHERE customer_id = ?)";
        try (Connection connection = dbUtil.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setInt(1, customerId);
            preparedStatement.setInt(2, customerId);
            ResultSet resultSet = preparedStatement.executeQuery();

            request.setAttribute("passbookEntries", resultSet);
            System.out.println(resultSet.toString());
            System.out.println(resultSet.getFetchSize());
            RequestDispatcher dispatcher = request.getRequestDispatcher("ViewPassbook.jsp");
            dispatcher.forward(request, response);
            return;
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
            dispatcher.forward(request, response);
            return;
        }
    }
}