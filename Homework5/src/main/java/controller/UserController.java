package main.java.controller;

import main.java.model.User;
import main.java.service.UserListService;

import java.util.List;

public class UserController {
    private final UserListService userListBank = new UserListService();

    public void addUserListBank(String name) {
        userListBank.addUserListBank(name);
    }

    public List<User> getUserListBank() {
        return userListBank.getUserListBank();
    }

    public void printUserListBank() {
        userListBank.printUserListBank();
    }

    public boolean findUserUserListBank(int idUser) {
        return userListBank.findUserUserListBank(idUser);
    }
}
