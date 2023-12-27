package fulfillment;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import orders.model.Order;

public class FulFillHandler implements RequestHandler<Order, Order> {
    @Override
    public Order handleRequest(Order order, Context context) {
        order.setOrderStatus("Completed");
        order.setPayment("Completed");
        //return order;

        //SIMULATE STOCK IS UNAVAILABLE - uncomment line below
        throw new StockException(order.getOrderId());
    }
}
