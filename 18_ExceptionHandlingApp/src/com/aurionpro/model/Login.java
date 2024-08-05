package com.aurionpro.model;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;
import java.util.regex.Pattern;

public class Login {
    private String email;
    private String password;

    public Login(String email, String password) {
        setEmail(email);            
        setPassword(password);     
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!validateEmail(email)) {
            throw new EmailNotValidException("Invalid email format: " + email);
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!validatePassword(password)) {
            throw new PasswordNotValidException("Password requirements not met: " + password);
        }
        this.password = password;
    }
    
    public static boolean validateEmail(String userEmail) {
        if (userEmail == null || userEmail.isEmpty()) {
            return false;
        }
        String emailRegex = "^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, userEmail);
    }

    public static boolean validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.matches(passwordRegex, password);
    }

    @Override
    public String toString() {
        return "Login [email=" + email + ", password=" + password + "]";
    }
}
