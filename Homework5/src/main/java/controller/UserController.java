package main.java.controller;

import main.java.model.User;
import main.java.service.UserListService;

import java.util.List;

public class UserController {
    private final UserListService userListBank = new UserListService();

    public void addUserListBank(String name, int age){
        userListBank.addUserListBank(new User(name, age));
    }

    public List<User> getUserListBank(){
        return userListBank.getUserListBank();
    }

    public void printUserListBank(){
        userListBank.printUserListBank();
    }
}
