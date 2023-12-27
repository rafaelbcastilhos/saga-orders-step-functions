package refund;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import orders.model.Order;

public class RefundHandler implements RequestHandler<Order, Order> {
    @Override
    public Order handleRequest(Order order, Context context) {
        order.setPayment("Refunded");
        order.setOrderStatus("Canceled");
        return order;
    }
}
