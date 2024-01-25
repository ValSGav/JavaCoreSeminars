package seminar4.HomeWork;

import lombok.Data;

@Data
public class Order {
    private final Customer customer;
    private final Product product;
}
