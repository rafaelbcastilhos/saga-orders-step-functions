package orders.model;

import java.util.UUID;

public class Order {
    private String orderId;
    private String customerId;
    private String amount;
    private String orderStatus;
    private String payment;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Order(RequestOrder request) {
        this.orderId = UUID.randomUUID().toString();
        this.customerId = request.getCustomerId();
        this.orderStatus = "Created";
        this.payment = "Pending";
        this.amount = request.getAmount();
    }
}
