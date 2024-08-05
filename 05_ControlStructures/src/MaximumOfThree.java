import java.util.Scanner;

public class MaximumOfThree {
	public static void main(String[] args) {
		System.out.println("Enter the 1st number: ");
		Scanner scanner1 = new Scanner(System.in);
		int number1 = scanner1.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		Scanner scanner2 = new Scanner(System.in);
		int number2 = scanner2.nextInt();
		
		System.out.println("Enter the 3rd number: ");
		Scanner scanner3 = new Scanner(System.in);
		int number3 = scanner3.nextInt();
		
		if(number1 > number2 && number1 > number3) {
			System.out.println("number1 is maximum");
		}
		else if(number2 > number1 && number2 > number3) {
			System.out.println("number2 is maximum");
		}
		else {
			System.out.println("number3 is maximum");
		}	
		
	}

}
