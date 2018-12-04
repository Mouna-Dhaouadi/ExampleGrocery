package thiagodnf.sootparser.example.grocery.report;

import java.util.List;

import thiagodnf.sootparser.example.grocery.order.Order;

public abstract class Report {

	public abstract String print(List<Order> orders);
}
