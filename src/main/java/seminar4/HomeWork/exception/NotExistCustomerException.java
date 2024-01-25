package seminar4.HomeWork.exception;

public class NotExistCustomerException extends RuntimeException{
    String customerName;

    public NotExistCustomerException(String message, String customerName) {
        super(message);
        this.customerName = customerName;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Not exist this customer! ";
    }

    @Override
    public String toString() {
        return "NotExistCustomerException{" +
                "customerName='" + customerName + '\'' +
                '}';
    }
}
