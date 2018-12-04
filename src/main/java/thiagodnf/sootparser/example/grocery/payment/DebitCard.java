package thiagodnf.sootparser.example.grocery.payment;

public class DebitCard extends Card{

	protected String number;	
	
	protected String securityNumber;
		
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return DebitCard.class.getSimpleName();
	}	
}
