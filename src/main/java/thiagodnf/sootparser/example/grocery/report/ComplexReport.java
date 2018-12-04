package thiagodnf.sootparser.example.grocery.report;

import java.util.List;

import thiagodnf.sootparser.example.grocery.order.Item;
import thiagodnf.sootparser.example.grocery.order.Order;

public class ComplexReport extends Report{

	@Override
	public String print(List<Order> orders) {
		
		StringBuilder builder = new StringBuilder();

		builder.append("Complex Report").append("\n");

		for (Order order : orders) {
			builder.append("Order ").append(order.orderId);
			builder.append(" | Raw Price $").append(order.getRawPrice());
			builder.append(" | Final Price: $").append(order.getFinalPrice());
			builder.append(" | Discount: ").append(order.getDiscount()*100).append("%");
			builder.append(" | Payment: ").append(order.getPayment());
			builder.append("\n");
			
			for(Item item : order.getItems()){
				builder.append("\t").append(item.getProductId());
				builder.append(" ").append(item.getProductName());
				builder.append(" | ").append(item.getAmount()).append(" x $").append(item.getPrice());
				builder.append(" = $").append(item.getRawPrice());
				builder.append(" - ").append(item.getDiscount()*100).append("%");
				builder.append(" = $").append(item.getFinalPrice());
				builder.append("\n");
			}
			
			builder.append("\n");
		}

		return builder.toString();
	}

}
