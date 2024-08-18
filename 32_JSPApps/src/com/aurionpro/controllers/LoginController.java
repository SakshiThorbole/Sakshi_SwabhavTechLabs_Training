package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    public LoginController() {
        super();
        
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        String username = request.getParameter("username");
        
        // Create a session and add the username to it
        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        response.getWriter().print("<form action='PasswordController' method='post'>");
        response.getWriter().print("Password: <input type='password' name='password'><br>");
        response.getWriter().print("<input type='submit' value='Go'></form>");
        	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
