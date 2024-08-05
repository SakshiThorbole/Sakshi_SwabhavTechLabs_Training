import java.util.Scanner;

public class CalculateBMI {
	public static void main(String[] args) {
		
		double weight = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		
		double BMI = weight / (height * height);
		
		System.out.println("Your BMI is: " + BMI);
	}
}
