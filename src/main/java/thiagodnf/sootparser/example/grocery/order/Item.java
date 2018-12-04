package thiagodnf.sootparser.example.grocery.order;

import thiagodnf.sootparser.example.grocery.util.UUIDUtil;

public class Item {

	public long itemId;

	protected long productId;
	
	protected String productName;
	
	public String productBrand;

	protected int amount;

	protected double price;

	protected double discount;
	
	public Item(){
		this.itemId = UUIDUtil.getId();
		this.productId = UUIDUtil.getId();
	}
	
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getRawPrice() {
		return amount * price;
	}

	public double getFinalPrice() {
		return getRawPrice() * (1.0 - discount);
	}
	
	public String toString() {
		return itemId + " " + productName + " " + price + " ";
	}
}

