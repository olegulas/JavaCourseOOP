package main.java.service;

import main.java.model.User;
import main.java.model.UserListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserListService implements Iterable {
    private final List<User> userListBank;

    public UserListService() {
        this.userListBank = new ArrayList<>();
    }

    public List<User> getUserListBank() {
        return userListBank;
    }

    public void addUserListBank(User user) {
        userListBank.add(user);
    }

    public void printUserListBank(){
        UserListIterator itr = new UserListIterator(userListBank);
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }

    @Override
    public Iterator iterator() {
        Iterator itr = new UserListIterator(userListBank);
        return itr;
    }
}
