package main.java.service;

import main.java.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserListService {
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

    }

    public boolean findUserUserListBank(int idUser) {
        for (User user : userListBank) {
            if (user.getIdUser() == idUser) {
                return true;
            }
        }
        return false;
    }
}
