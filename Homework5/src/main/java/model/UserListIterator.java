package main.java.model;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class UserListIterator<T> implements Iterator {
    private int counter;
    private final List<T> itemList;

    public UserListIterator(T itemList) {
        this.counter = 0;
        this.itemList = (List<T>) itemList;
    }

    @Override
    public boolean hasNext() {
        return counter < itemList.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserListIterator<?> that = (UserListIterator<?>) o;
        return counter == that.counter && Objects.equals(itemList, that.itemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(counter, itemList);
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return itemList.get(counter++);
    }
}
