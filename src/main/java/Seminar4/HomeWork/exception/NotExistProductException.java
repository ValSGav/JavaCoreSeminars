package Seminar4.HomeWork.exception;

public class NotExistProductException extends RuntimeException{
    String productName;

    public NotExistProductException(String message, String productName) {
        super(message);
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "NotExistProductException{" +
                "ProductName='" + productName + '\'' +
                '}';
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Not exist this product! ";
    }
}
