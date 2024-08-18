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

@WebServlet("/EditProfileController")
public class EditProfileController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DbUtil dbUtil;

    public EditProfileController() {
        super();
    }

    @Override
    public void init() throws ServletException {
        dbUtil = DbUtil.getDbUtil();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = (String) request.getSession().getAttribute("username");
        
        if (email == null || email.isEmpty()) {
            request.setAttribute("errorMessage", "User not logged in.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerDashboard.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Retrieve customer details
        String[] customerDetails = getCustomerDetails(email);

        if (customerDetails != null) {
            request.setAttribute("first_name", customerDetails[0]);
            request.setAttribute("last_name", customerDetails[1]);
            request.setAttribute("password", customerDetails[2]);
            RequestDispatcher dispatcher = request.getRequestDispatcher("EditProfile.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Error retrieving customer details.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerDashboard.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = (String) request.getSession().getAttribute("username");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String password = request.getParameter("password");

        boolean isUpdated = updateCustomerDetails(email, firstName, lastName, password);

        if (isUpdated) {
            request.setAttribute("updateMessage", "Details updated successfully.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("EditProfile.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Error updating customer details.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("EditProfile.jsp");
            dispatcher.forward(request, response);
        }
    }

    private String[] getCustomerDetails(String email) {
        String[] details = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = dbUtil.getConnection();
            String query = "SELECT first_name, last_name, password FROM customer WHERE email = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            if (rs.next()) {
                details = new String[3];
                details[0] = rs.getString("first_name");
                details[1] = rs.getString("last_name");
                details[2] = rs.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(rs, stmt, con);
        }

        return details;
    }

    private boolean updateCustomerDetails(String email, String firstName, String lastName, String password) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = dbUtil.getConnection();
            String query = "UPDATE customer SET first_name = ?, last_name = ?, password = ? WHERE email = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, password);
            stmt.setString(4, email);
            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(null, stmt, con);
        }

        return false;
    }
}
