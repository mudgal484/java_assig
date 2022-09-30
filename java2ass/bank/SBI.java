package bank;

public class SBI extends Bank {


	public SBI(String bankName, double rateOfInterest) {
		super(bankName, rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	private static SBI single_instance = null;
	
	public static SBI getInstance() {
		if(single_instance == null) {
			single_instance = new SBI("SBI",3.0);
		}
		return single_instance;
	}
	
	
	

}
