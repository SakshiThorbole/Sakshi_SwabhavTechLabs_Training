
public class DistanceCalculator {
	public static void main(String[] args) {
		double x1 = Double.parseDouble(args[0]);
		double x2 = Double.parseDouble(args[1]);
		double y1 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		
		double distance = calculateDistance(x1, y1, x2, y2);
		
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
	}
	
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
}
