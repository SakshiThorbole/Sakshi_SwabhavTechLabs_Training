package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Car;
import com.aurionpro.list.model.Student;

public class CarTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Car> cars = new ArrayList<Car>();
		
		System.out.println("How many details of car you have?");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter car ID: ");
			int iD = scanner.nextInt();
			
			System.out.println("Enter company name: ");
			String companyName = scanner.next();
			
			System.out.println("Enter mileage");
			int mileage = scanner.nextInt();
			
			cars.add(new Car(iD, companyName, mileage));
		}
		
		Car carWithMaxMileage = findCarWithMaxMileage(cars);
        System.out.println("Car with maximum mileage: " + carWithMaxMileage);
	}
	
	private static Car findCarWithMaxMileage(List<Car> cars) {
        
        Car maxMileageCar = cars.get(0);
        for (Car car : cars) {
            if (car.getMileage() > maxMileageCar.getMileage()) {
                maxMileageCar = car;
            }
        }
        return maxMileageCar;
	}

}
