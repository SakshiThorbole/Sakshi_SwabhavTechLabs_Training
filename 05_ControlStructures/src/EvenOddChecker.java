import java.util.Scanner;

public class EvenOddChecker {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s1 = new Scanner(System.in);
		int number = s1.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Number is Even!!");
		}
		else {
			System.out.println("Number is Odd!!");
		}
		
	}

}
