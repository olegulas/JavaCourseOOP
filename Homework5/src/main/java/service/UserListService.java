package main.java.service;

import main.java.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserListService implements Iterator<User> {
    private final List<User> userListBank;

    public UserListService() {
        this.userListBank = new ArrayList<>();
    }

    public List<User> getUserListBank() {
        return userListBank;
    }

    public void addUserListBank(String name) {
        userListBank.add(new User(userListBank.size() + 1, name));
    }

    public void printUserListBank() {
        for (User user : userListBank) {
            System.out.println(user);
        }
        System.out.println();
    }

    public void removeUserListBank(int idUser) {
        boolean isExistUser = false;
        Iterator<User> iterator = userListBank.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getIdUser() == idUser){
                iterator.remove();
                isExistUser = true;
            }
        }
        if (!isExistUser) System.out.printf("User ID:%d not exist\n", idUser);
    }

    public boolean findUserUserListBank(int idUser) {
        for (User user : userListBank) {
            if (user.getIdUser() == idUser) {
                return true;
            }
        }
        return false;
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

    @Override
    public void remove() {
        userListBank.remove(this.userListBank);
    }
}
