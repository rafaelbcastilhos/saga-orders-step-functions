package fulfillment;

public class StockException extends RuntimeException{
    public StockException(){
        super();
    }

    public StockException(String message) {
        super(message);
    }
}
