package payment;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import orders.model.Order;

public class PaymentHandler implements RequestHandler<Order, Order> {
    @Override
    public Order handleRequest(Order order, Context context) {
        order.setPayment("Completed");
        return order;

        //SIMULATE PAYMENT FAILURE - uncomment line below
        //throw new PaymentException(order.getOrderId());
    }
}
