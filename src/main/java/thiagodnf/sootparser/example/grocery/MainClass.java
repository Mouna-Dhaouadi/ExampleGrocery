package thiagodnf.sootparser.example.grocery;

import java.util.Arrays;
import java.util.List;

import thiagodnf.sootparser.example.grocery.customer.Customer;
import thiagodnf.sootparser.example.grocery.departament.ITDepartament;
import thiagodnf.sootparser.example.grocery.employee.Employee;
import thiagodnf.sootparser.example.grocery.order.Item;
import thiagodnf.sootparser.example.grocery.order.Order;
import thiagodnf.sootparser.example.grocery.payment.Cash;
import thiagodnf.sootparser.example.grocery.payment.CreditCard;
import thiagodnf.sootparser.example.grocery.payment.DebitCard;
import thiagodnf.sootparser.example.grocery.payment.Payment;

public class MainClass {
	
	public static void main(String[] args) {
		
		ITDepartament department = new ITDepartament();
		
		department.getEmployees().add(new Employee("Matheus"));
		department.getEmployees().add(new Employee("Karl"));

		Customer c1 = new Customer("John");
		Customer c2 = new Customer("Peter");
		Customer c3 = new Customer("Lisa");

		Item i1 = createItem("Rice", 10, 2, 0.0);
		Item i2 = createItem("Bean", 5, 1, 0.1);
		Item i3 = createItem("Apple", 3, 14, 0.0);
		Item i4 = createItem("Tomato", 4, 5, 0.5);
		Item i5 = createItem("Pasta", 2, 3, 0.0);

		Order o1 = createOrder(c1, Arrays.asList(i1, i2), 0.0, new Cash());
		Order o2 = createOrder(c2, Arrays.asList(i2, i4, i5), 0.0, new CreditCard());
		Order o3 = createOrder(c2, Arrays.asList(i4, i5), 0.0, new DebitCard());
		Order o4 = createOrder(c3, Arrays.asList(i2, i3, i4, i5), 0.1, new DebitCard());

		department.getEmployees().get(0).printSimpleReports(Arrays.asList(o1, o2, o3, o4));
		department.getEmployees().get(0).printComplexReports(Arrays.asList(o1, o2, o3, o4));
	}
	
	public static Order createOrder(Customer c, List<Item> items, double discount, Payment payment) {

		Order order = new Order();

		order.setItems(items);
		order.setPayment(payment);
		order.setDiscount(discount);

		return order;
	}

	public static Item createItem(String productName, int amount, double price, double discount) {

		Item item = new Item();

		item.setProductName(productName);
		item.setPrice(price);
		item.setDiscount(discount);
		item.setAmount(amount);

		return item;
	}

}
