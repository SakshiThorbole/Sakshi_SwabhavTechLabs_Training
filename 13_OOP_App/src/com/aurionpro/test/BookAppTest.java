package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BookApp;

public class BookAppTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		BookApp books[] = new BookApp[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter Book ID: ");
			int bookID = scanner.nextInt();
			
			System.out.println("Enter book name: ");
			String name = scanner.next();
			
			System.out.println("Enter author name: ");
	        String author = scanner.next();

	        System.out.println("Enter price: ");
	        double price = scanner.nextDouble();

	        books[i] = new BookApp(bookID, name, author, price);
		}
		
		for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (books[j].getPrice() < books[j + 1].getPrice()) {
                    BookApp temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
		System.out.println("Books sorted by price in descending order:");
		
		for (int i = 0; i < size; i++) {
            books[i].display();
        }

	}

}
