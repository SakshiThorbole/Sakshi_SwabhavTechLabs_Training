package com.aurionpro.test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamFileCopying {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro Training\\08_StreamApp\\src\\test1");
			int ch;
			
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro Training\\08_StreamApp\\src\\test2");
			
			while((ch=fileInputStream.read()) != -1) {
				fileOutputStream.write(ch);
			}
			
			System.out.println("File copied successfully");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
