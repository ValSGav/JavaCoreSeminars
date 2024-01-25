package seminar4.HomeWork;

import seminar4.HomeWork.impl.AvailableCustomer;
import seminar4.HomeWork.impl.AvailableProduct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OnlineStore {
    private AvailableProduct avbProducts;
    private AvailableCustomer avbCustomers;

    private final ArrayList<Order> orderList;

    public OnlineStore() {
        orderList = new ArrayList<>();
        avbCustomers = new AvailableCustomer();
        avbProducts = new AvailableProduct();
    }

    public void addAvailableProduct(Product product) {
        this.avbProducts.addItem(product);
    }

    public void addAvailableCustomer(Customer customer) {
        this.avbCustomers.addItem(customer);
    }

    public boolean addOrder(String customerName, String productName) throws RuntimeException {
        try {
            Customer customer = this.avbCustomers.getAvailableItem(customerName);
            Product product = this.avbProducts.getAvailableItem(productName);

            this.orderList.add(new Order(customer, product));
            return true;
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage() + e.toString() + " addOrder exception");
        }
    }

    public int getOrderCount() {
        return orderList.size();
    }

    @Override
    public String toString() {
        return "OnlineStore{" +
                "orderList=" + orderList +
                '}';
    }

    public void congratulationsToEveryone(Calendar date) {

        String dateMonthDay = String.format("%d.%d", date.get(Calendar.DAY_OF_MONTH), date.get(Calendar.MONTH));
        for (Customer customer : avbCustomers.listOfItem){
            SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
            String beginString = format.format(date.getTime()) + ", " + customer.getName() + ", ";
            switch (dateMonthDay) {
                case "8.2" -> {
                    if (customer.getGender() == Gender.FEMALE)
                        System.out.println(beginString + Holidays.MART8);
                    else System.out.println(beginString + Holidays.NOHOLIDAYS);
                }
                case "23.1" -> {
                    if (customer.getGender() == Gender.MALE)
                        System.out.println(beginString + Holidays.FEBRUARY23);
                    else System.out.println(beginString + Holidays.NOHOLIDAYS);


                }
                case "1.0" ->{
                    System.out.println(beginString + Holidays.NEWYEAR);
                }
                default -> {
                    if (dateMonthDay.equals(customer.getBirthDayMonth())){
                        System.out.println(beginString + Holidays.BIRTHDAY);
                    } else {
                        System.out.println(beginString + Holidays.NOHOLIDAYS);
                    }
                }
            }}
    }

    public void congratulationsToEveryone() {
        Calendar date = new GregorianCalendar();
        congratulationsToEveryone(date);
    }

}
