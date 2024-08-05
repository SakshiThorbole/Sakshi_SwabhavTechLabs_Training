
import java.util.Scanner;

public class MonthSeasonChecker {
	public static void main(String[] args) {
		System.out.println("Enter a month: ");
		Scanner scanner1 = new Scanner(System.in);
		int month = scanner1.nextInt();
		
		switch(month) {
		case 1: System.out.println("Winter");
				  break;
			
		case 2: 
		
		case 3: 
			
		case 4: 
			
		case 5: 
			
		case 6: System.out.println("Summer");
	      break;
				
		case 7:
			System.out.println("Rainy");
			break;
			
		case 8:
			
				
		case 9:
			
		case 10: 
			System.out.println("Rainy");
			break;
				
		case 11:
			
		case 12:
				
				default:
					System.out.println("Invalid Output!!");
					
			}
		}
	}
			
			