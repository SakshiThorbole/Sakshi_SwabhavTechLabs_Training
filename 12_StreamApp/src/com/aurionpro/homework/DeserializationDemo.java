package com.aurionpro.homework;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DeserializationDemo {
	public static void main(String[] args) {
		Person person = null;

        try (
        	FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro Assignment\\12_StreamApp\\src\\com\\aurionpro\\homework\\TestFile");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            person = (Person) objectInputStream.readObject();
            
            System.out.println("Deserialized Person...");
            System.out.println(person);
            
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Student class not found");
            c.printStackTrace();
        }
	}

}
