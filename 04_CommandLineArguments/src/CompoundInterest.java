
public class CompoundInterest {
	public static void main(String[] args) {
		int principalAmount = Integer.parseInt(args[0]);
		int rateOfInterest = Integer.parseInt(args[1]);
		int timePeriod = Integer.parseInt(args[2]);
		
		double compoundInterest = principalAmount * (1 + rateOfInterest / 100)^timePeriod;
		
		System.out.println("Principal: " + principalAmount);
	    System.out.println("Interest Rate: " + rateOfInterest);
	    System.out.println("Time Duration: " + timePeriod);
		System.out.println("The compound interest is: " + compoundInterest);
	}

}
