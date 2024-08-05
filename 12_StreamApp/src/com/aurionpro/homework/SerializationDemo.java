package com.aurionpro.homework;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationDemo {
    public static void main(String[] args) {
        Person person = new Person("Sakshi", 24);

        try (
        	 FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro Assignment\\12_StreamApp\\src\\com\\aurionpro\\homework\\TestFile");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
             objectOutputStream.writeObject(person);
             
            System.out.println("Serialized data is saved in TextFile.txt");
            
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
