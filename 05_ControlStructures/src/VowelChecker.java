import java.util.Scanner;

public class VowelChecker {
	public static void main(String[] args) {
		System.out.println("Enter a letter: ");
		Scanner scanner1 = new Scanner(System.in);
		char ch = scanner1.next().charAt(0);
		
		switch(ch) {
		case 'a':
			System.out.println("Vowel");
			break;
			
		case 'e':
			System.out.println("Vowel");
			break;
		
		case 'i':
			System.out.println("Vowel");
			break;
			
		case 'o':
			System.out.println("Vowel");
			break;
			
		case 'u':
			System.out.println("Vowel");
			break;
			
			default:
				System.out.println("Not a Vowel");
				
		}
	}
}
