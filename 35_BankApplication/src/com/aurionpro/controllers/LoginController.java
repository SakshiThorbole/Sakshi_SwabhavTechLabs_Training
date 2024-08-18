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

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DbUtil dbUtil;

    public LoginController() {
        super();
    }

    @Override
    public void init() throws ServletException {
        dbUtil = DbUtil.getDbUtil();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        boolean isValidUser = DbUtil.getDbUtil().validateUser(username, password, role);

        if (isValidUser) {
            if ("admin".equalsIgnoreCase(role)) {
                // Redirect to Admin Dashboard
                RequestDispatcher dispatcher = request.getRequestDispatcher("AdminDashboard.jsp");
                dispatcher.forward(request, response);
            } else if ("customer".equalsIgnoreCase(role)) {
                // Retrieve customer details
                CustomerDetails customerDetails = getCustomerDetails(username, password);
                if (customerDetails != null) {
                    // Set customer details in session
                    HttpSession session = request.getSession();
                    session.setAttribute("firstName", customerDetails.getFirstName());
                    session.setAttribute("username", username); // Store username in session
                    session.setAttribute("customer_id", customerDetails.getCustomerId()); // Store customer_id in session
                    RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerDashboard.jsp");
                    dispatcher.forward(request, response);
                } else {
                    request.setAttribute("errorMessage", "Error retrieving customer details.");
                    RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
                    dispatcher.forward(request, response);
                }
            }
        } else {
            // Invalid credentials
            request.setAttribute("errorMessage", "Invalid username, password, or role.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
            dispatcher.forward(request, response);
        }
    }

    private CustomerDetails getCustomerDetails(String email, String password) {
        CustomerDetails customerDetails = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = DbUtil.getDbUtil().getConnection();
            String query = "SELECT customer_id, first_name FROM customer WHERE email = ? AND password = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, password);
            rs = stmt.executeQuery();

            if (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String firstName = rs.getString("first_name");
                customerDetails = new CustomerDetails(customerId, firstName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(rs, stmt, con);
        }

        return customerDetails;
    }
}
