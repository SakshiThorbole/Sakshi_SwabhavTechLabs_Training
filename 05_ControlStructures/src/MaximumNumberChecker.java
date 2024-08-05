import java.util.Scanner;

public class MaximumNumberChecker {
	public static void main(String[] args) {
		System.out.println("Enter the 1st number: ");
		Scanner s1 = new Scanner(System.in);
		int number1 = s1.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		Scanner s2 = new Scanner(System.in);
		int number2 = s1.nextInt();
		
		if(number1 > number2) {
			System.out.println("number1 is greater");
		}
		else {
			System.out.println("number2 is greater");
		}
	}

}
