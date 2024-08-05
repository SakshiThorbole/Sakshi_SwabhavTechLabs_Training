package com.aurionpro.model;

public class BookApp {
	private int bookID;
	private String name;
	private String author;
	private double price;
	
	public BookApp(int bookID, String name, String author, double price) {
		this.bookID = bookID;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getBookID(){
		return this.bookID;
	}
	
	public void setName(String name) {
        this.name = name;
    }
	public String getName() {
        return this.name;
    }

	public void setAuthor(String author) {
        this.author = author;
	}
    public String getAuthor() {
        return this.author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }

    public void display() {
        System.out.println("Book ID: " + this.getBookID());
        System.out.println("Name: " + this.getName());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Price: $" + this.getPrice());
    }
}
