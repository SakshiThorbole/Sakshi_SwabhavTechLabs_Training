
public class TimeConverter {
	public static void main(String[] args) {
		int totalMinutes = Integer.parseInt(args[0]);
		
		int hours = totalMinutes / 60;
		int minutes = totalMinutes % 60;
		
		System.out.println(totalMinutes + " minutes is " + hours + " hours and " + minutes + " minutes.");
	}

}
