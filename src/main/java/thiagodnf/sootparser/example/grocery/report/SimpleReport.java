package thiagodnf.sootparser.example.grocery.report;

import java.util.List;

import thiagodnf.sootparser.example.grocery.order.Order;

public class SimpleReport extends Report {

	@Override
	public String print(List<Order> orders) {

		StringBuilder builder = new StringBuilder();

		builder.append("Simple Report").append("\n");

		for (Order order : orders) {
			builder.append("Order ").append(order.orderId).append(" ");
			builder.append("Final Price: $").append(order.getFinalPrice());
			builder.append(" | Payment: ").append(order.getPayment());
			builder.append("\n");
		}

		return builder.toString();
	}
}
