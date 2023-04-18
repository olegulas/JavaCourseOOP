package main.java.model;

import java.util.Iterator;
import java.util.List;

public class UserListIterator implements Iterator {
    private int counter;
    private final List<User> itemList;

    public UserListIterator(List<User> itemList) {
        this.counter = 0;
        this.itemList = itemList;
    }

    @Override
    public boolean hasNext() {
        return counter < itemList.size();
    }

    @Override
    public User next() {
        if (!hasNext()) {
            return null;
        }
        return itemList.get(counter++);
    }
}
