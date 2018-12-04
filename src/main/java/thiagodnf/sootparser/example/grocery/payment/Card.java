package thiagodnf.sootparser.example.grocery.payment;

public abstract class Card extends Payment{
	
	protected String expirationDate;
	
	protected String name;
	
	public String flag;

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
