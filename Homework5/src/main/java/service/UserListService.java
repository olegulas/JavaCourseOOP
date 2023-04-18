package main.java.service;

import main.java.model.Score;
import main.java.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserListService {
    private List<User> userListBank;

    public UserListService() {
        this.userListBank = new ArrayList<>();
    }

    public List<User> getUserListBank() {
        return userListBank;
    }

    public void addUserListBank(User user) {
        userListBank.add(user);
    }

    public void calcResultScore(User user) {
        double result = 0;
        for (Score score : user.getScoreList()) {
            result += score.getBalanceScore();
        }
        user.setResultBalance(result);
    }

    public void withdrawalScore(User user, int idScore, double payment){
        this.userListBank.
    }
}
