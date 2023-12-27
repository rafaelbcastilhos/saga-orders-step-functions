package payment;

public class PaymentException extends RuntimeException {
    public PaymentException(){
        super();
    }

    public PaymentException(String order){
        super(order);
    }
}
