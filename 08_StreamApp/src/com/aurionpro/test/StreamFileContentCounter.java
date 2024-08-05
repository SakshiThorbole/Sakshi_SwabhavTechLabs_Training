package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamFileContentCounter {

	public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro Training\\08_StreamApp\\src\\test1");
			int ch; 
			int characterCount = 0;
	        int wordCount = 0;
	        int lineCount = 0;
	        
	        boolean inWord = false;

            while ((ch = fileInputStream.read()) != -1) {
                characterCount++;
                if (ch == ' ' || ch == '\n' || ch == '\t') {
                    if (inWord) {
                        wordCount++;
                        inWord = false;
                    }
                    if (ch == '\n') {
                        lineCount++;
                    }
                } else {
                    inWord = true;
                }
            }

            if (inWord) {
                wordCount++;
            }

            if (characterCount > 0 && ch != '\n') {
                lineCount++;
            }
	        System.out.println("Character count is: " + characterCount);
	        System.out.println("Word count is: " + wordCount);
	        System.out.println("Line count is: " + lineCount);

	            		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
