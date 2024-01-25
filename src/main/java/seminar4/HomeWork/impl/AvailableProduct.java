package seminar4.HomeWork.impl;

import seminar4.HomeWork.AvailableItem;

import seminar4.HomeWork.Product;

import seminar4.HomeWork.exception.NotExistProductException;

import java.util.Optional;

public class AvailableProduct extends AvailableItem<Product> {
    @Override
    public Product getAvailableItem(String itemName) throws NotExistProductException {

        Product returnItem;

        Optional<Product> optReturnItem = Optional.ofNullable(listOfItem.stream()
                .filter(e -> e.getName() == itemName)
                .findFirst()
                .orElse(null));
        returnItem = optReturnItem.orElse(null);

        if (returnItem == null)
            throw new NotExistProductException("Not exist item in product list!", itemName);
        return returnItem;
    }
}
