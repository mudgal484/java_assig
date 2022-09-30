package bank;

public class ICICI extends Bank {


	public ICICI(String bankName, double rateOfInterest) {
		super(bankName, rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	private static ICICI single_instance = null;
	
	public static ICICI getInstance() {
		if(single_instance == null) {
			single_instance = new ICICI("ICICI",4.0);
		}
		return single_instance;
	}
	
	
	

}
