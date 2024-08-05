package com.aurionpro.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileStreamExample {
    public static void main(String[] args) {
        try {
            long lineCount = Files.lines(Paths.get("D:\\Aurionpro Assignment\\21_StreamApp\\src\\com\\aurionpro\\test\\test.txt"))
                                  .filter(line -> !line.trim().isEmpty())
                                  .count();
            System.out.println("Line count is: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
