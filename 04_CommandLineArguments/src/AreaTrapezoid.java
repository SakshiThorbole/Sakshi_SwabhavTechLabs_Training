
public class AreaTrapezoid {
	public static void main(String[] args) {
		int lengthBase1 = Integer.parseInt(args[0]);
		int lengthBase2 = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);
		
		int area = (lengthBase1 + lengthBase2) / 2 * height;
		
		System.out.println("Base 1 length of Trapezoid: " + lengthBase1);
	    System.out.println("Base 2 length of Trapezoid: " + lengthBase2);
	    System.out.println("Height of Trapezoid: " + height);
		System.out.println("The area of Trapezoid is: " + area);
	}

}
