import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		double Fahrenheit = 0, Celsius = 0, Kelvin = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter temperature: ");
		double temperature = scanner.nextDouble();

		System.out.println("Choose conversion:");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.println("3. Celsius to Kelvin");
		System.out.println("4. Kelvin to Celsius");
		System.out.println("5. Fahrenheit to Kelvin");
		System.out.println("6. Kelvin to Fahrenheit");

		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			Fahrenheit = Celsius* (9/5) + 32;
			System.out.println("Celsius to Fahrenheit: " + Fahrenheit);
			break;
			
		case 2:
			Celsius = (Fahrenheit-32)*(5/9);
			System.out.println("Fahrenheit to Celsius " + Celsius);
			break;
			
		case 3:
			Kelvin = Celsius + 273.15;
			System.out.println("Celsius to Kelvin " + Kelvin);
			break;
			
		case 4:
			Celsius = Kelvin - 273.15;
			System.out.println("Kelvin to Celsius " + Celsius);
			break;
			
		case 5:
			Kelvin = (Fahrenheit-32)*(5/9) + 273.15;
			System.out.println("Fahrenheit to Kelvin " + Kelvin);
			break;
			
		case 6:
			Fahrenheit = (Kelvin-273.15)*(9/5) + 32;
			System.out.println(" Kelvin to Fahrenheit " + Fahrenheit);
			break;
		}
	
	}

}


