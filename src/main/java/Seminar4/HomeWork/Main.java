package Seminar4.HomeWork;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        Customer newCustomer = new Customer("Ivan");
        newCustomer.setGender(Gender.MALE);
        newCustomer.setBirthDay(new GregorianCalendar(1972, 1, 1));
        store.addAvailableCustomer(newCustomer);

        newCustomer = new Customer("Semen");
        newCustomer.setGender(Gender.MALE);
        newCustomer.setBirthDay(new GregorianCalendar(1966, 3, 17));
        store.addAvailableCustomer(newCustomer);

        newCustomer = new Customer("Irina");
        newCustomer.setGender(Gender.FEMALE);
        newCustomer.setBirthDay(new GregorianCalendar(1983, 7, 12));
        store.addAvailableCustomer(newCustomer);


        Product newProduct = new Product("Carrot");
        newProduct.setPrice(70);
        newProduct.setId(1);
        store.addAvailableProduct(newProduct);

        newProduct = new Product("Potato");
        newProduct.setPrice(20);
        newProduct.setId(2);
        store.addAvailableProduct(newProduct);

        newProduct = new Product("Tomato");
        newProduct.setPrice(340);
        newProduct.setId(3);
        store.addAvailableProduct(newProduct);

        try {
            store.addOrder("Ivan", "Carrot");
            store.addOrder("Irina", "Potato");
            //store.addOrder("Peter", "Tomato");
            store.addOrder("Semen", "Strawberry");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(store.getOrderCount());
        System.out.println(store);

        store.congratulationsToEveryone(new GregorianCalendar(2000, 0, 1));
        store.congratulationsToEveryone(new GregorianCalendar(2000, 1, 23));
        store.congratulationsToEveryone(new GregorianCalendar(2000, 2, 8));
        store.congratulationsToEveryone(new GregorianCalendar(2000, 1, 1));
        store.congratulationsToEveryone(new GregorianCalendar(2000, 3, 17));
        store.congratulationsToEveryone();

    }
}
