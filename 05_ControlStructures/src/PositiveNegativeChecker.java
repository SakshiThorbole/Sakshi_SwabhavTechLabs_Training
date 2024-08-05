import java.util.Scanner;

public class PositiveNegativeChecker {
	public static void main(String[] args) {
		System.out.println("Enter the 1st number: ");
		Scanner s1 = new Scanner(System.in);
		int number1 = s1.nextInt();
		
		if(number1 > 0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
	}

}
