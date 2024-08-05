package com.aurionpro.test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamFileReadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro Training\\08_StreamApp\\src\\test1");
			int ch;
			
			while((ch=fileInputStream.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
