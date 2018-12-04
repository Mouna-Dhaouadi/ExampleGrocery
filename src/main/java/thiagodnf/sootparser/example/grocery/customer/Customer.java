package thiagodnf.sootparser.example.grocery.customer;

import java.util.Date;

import thiagodnf.sootparser.example.grocery.util.UUIDUtil;

public class Customer {
	
	public long customerId;
	
	protected String name;
	
	protected String addressStreet;
	
	protected String addressNumber;
	
	protected String addressZipCode;
	
	protected Date birthDate;
	
	public Customer(String name){
		this.customerId = UUIDUtil.getId();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getAddressZipCode() {
		return addressZipCode;
	}

	public void setAddressZipCode(String addressZipCode) {
		this.addressZipCode = addressZipCode;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}	
}
