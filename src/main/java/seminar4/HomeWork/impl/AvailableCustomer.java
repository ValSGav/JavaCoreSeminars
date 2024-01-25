package seminar4.HomeWork.impl;

import seminar4.HomeWork.AvailableItem;
import seminar4.HomeWork.Customer;
import seminar4.HomeWork.exception.NotExistCustomerException;

import java.util.Optional;

public class AvailableCustomer extends AvailableItem<Customer> {
    @Override
    public Customer getAvailableItem(String itemName) throws NotExistCustomerException {

        Customer returnItem;

        Optional<Customer> optReturnItem = Optional.ofNullable(listOfItem.stream()
                .filter(e -> e.getName() == itemName)
                .findFirst()
                .orElse(null));
        returnItem = optReturnItem.orElse(null);

        if (returnItem == null)
            throw new NotExistCustomerException("Not exist item in customer list!", itemName);
        return returnItem;
    }
}
