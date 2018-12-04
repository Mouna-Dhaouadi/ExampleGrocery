package thiagodnf.sootparser.example.grocery.order;

import java.util.ArrayList;
import java.util.List;

import thiagodnf.sootparser.example.grocery.customer.Customer;
import thiagodnf.sootparser.example.grocery.payment.Payment;
import thiagodnf.sootparser.example.grocery.util.UUIDUtil;

public class Order {
	
	public long orderId;
	
	protected long issuedDate;
	
	protected String notes;
	
	protected double discount;
	
	protected String shippingAddressStreet;
	
	protected String shippingAddressNumber;
	
	protected String shippingAddressZipCode;
	
	protected List<Item> items;
	
	protected Customer customer;
	
	protected Payment payment;
	
	public Order(){
		this.orderId = UUIDUtil.getId();
		this.items = new ArrayList<>();
		this.issuedDate = System.currentTimeMillis();
	}
	
	public long getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(long issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getShippingAddressStreet() {
		return shippingAddressStreet;
	}

	public void setShippingAddressStreet(String shippingAddressStreet) {
		this.shippingAddressStreet = shippingAddressStreet;
	}

	public String getShippingAddressNumber() {
		return shippingAddressNumber;
	}

	public void setShippingAddressNumber(String shippingAddressNumber) {
		this.shippingAddressNumber = shippingAddressNumber;
	}

	public String getShippingAddressZipCode() {
		return shippingAddressZipCode;
	}

	public void setShippingAddressZipCode(String shippingAddressZipCode) {
		this.shippingAddressZipCode = shippingAddressZipCode;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
		
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public double getRawPrice() {

		double value = 0.0;

		for (Item item : items) {
			value += item.getRawPrice();
		}

		return value;
	}

	public double getFinalPrice() {

		double value = 0.0;

		for (Item item : items) {
			value += item.getFinalPrice();
		}

		return value * (1.0 - discount);
	}
}
