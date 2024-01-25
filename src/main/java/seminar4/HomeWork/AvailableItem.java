package seminar4.HomeWork;

import java.util.ArrayList;
import java.util.List;

public abstract class AvailableItem<E> {
    protected List<E> listOfItem;

    public AvailableItem() {
        this.listOfItem = new ArrayList<>();
    }


    public void addItem(E item) {
        listOfItem.add(item);
    }


    public abstract E getAvailableItem(String itemName);
}
