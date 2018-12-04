package thiagodnf.sootparser.example.grocery.payment;

public class CreditCard extends Card{

	protected String number;	
	
	protected String securityNumber;

	public String getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}

	public double getDiscount() {

		if (flag.equalsIgnoreCase("Visa")) {
			return 0.1;
		}

		return 0.0;
	}
	
	@Override
	public String toString() {
		return CreditCard.class.getSimpleName();
	}
}
