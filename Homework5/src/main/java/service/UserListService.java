package main.java.service;

import main.java.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserListService implements Iterator<User> {
    private final List<User> userListBank;

    private static int indexUser = 0;

    public UserListService() {
        this.userListBank = new ArrayList<>();
    }

    public List<User> getUserListBank() {
        return userListBank;
    }

    public void addUserListBank(String name) {
        indexUser++;
        userListBank.add(new User(indexUser, name));
    }

    public void printUserListBank() {
        for (User user : userListBank) {
            System.out.println(user);
        }
        System.out.println();
    }

    public void removeUserListBank(int idUser) {
        Iterator<User> iterator = userListBank.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getIdUser() == idUser) {
                iterator.remove();
                return;
            }
        }
        System.out.printf("User ID:%d not exist\n", idUser);
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < userListBank.size();
    }

    @Override
    public User next() {
        return userListBank.get(index);
    }

}
