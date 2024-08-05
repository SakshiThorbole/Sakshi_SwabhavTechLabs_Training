package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileContentReader {

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro Assignment\\21_StreamApp\\src\\com\\aurionpro\\test\\test.txt")) {
            int lineCount = 0;
            int ch;

            boolean isEmpty = true;

            while ((ch = fileInputStream.read()) != -1) {
                if (ch == '\n') {
                    lineCount++;
                    isEmpty = false;
                } else if (isEmpty) {
                    isEmpty = false;
                }
            }

            // If the file is not empty and the last character is not a newline
            if (!isEmpty && ch != '\n') {
                lineCount++;
            }

            System.out.println("Line count is: " + lineCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
