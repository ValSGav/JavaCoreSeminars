package Seminar4.HomeWork;

import lombok.Data;

import java.util.Objects;

@Data
public class Product {
    private final String name;
    private double price;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

}
