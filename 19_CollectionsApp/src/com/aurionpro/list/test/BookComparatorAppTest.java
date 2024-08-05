package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.BookComparator;
import com.aurionpro.list.model.BookComparatorApp;

public class BookComparatorAppTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of books you want?");
		int size = scanner.nextInt();
		
		List<BookComparatorApp> books = new ArrayList<BookComparatorApp>();
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter the title of the book: ");
			String title = scanner.next();
			
			System.out.println("Enter the name of the author: ");
			String author = scanner.next();
			
			System.out.println("Enter the price of the book: ");
			double price = scanner.nextDouble();
			
			System.out.println("Enter the publication year of the book: ");
			int publicationYear = scanner.nextInt();
			
			books.add(new BookComparatorApp(title, author, price, publicationYear));
		}
		
		System.out.println("Books before sorting: --> ");
		
		for(BookComparatorApp book: books) {
			System.out.println(book);
		}
		
		System.out.println();
		
		books.sort(new BookComparator.BookAuthorComparator()
				.thenComparing(new BookComparator.BookTitleComparator()
					.thenComparing(new BookComparator.BookPriceComparator())));
		
		System.out.println("Books after sorting by author, then title, then price: --> ");
		
		for(BookComparatorApp book: books) {
			System.out.println(book);
		}
		
		System.out.println();
		
		books.sort(new BookComparator.BookPublicationYearComparator()
				.thenComparing(new BookComparator.BookPriceComparator()
					.thenComparing(new BookComparator.BookAuthorComparator())));
		
		System.out.println("Books after sorting by publication year, then price, then author: --> ");
		
		for(BookComparatorApp book: books) {
			System.out.println(book);
		}
	}

}
