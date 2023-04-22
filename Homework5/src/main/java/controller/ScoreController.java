package main.java.controller;

import main.java.model.User;
import main.java.service.ScoreListService;

import java.util.List;

public class ScoreController {
    private final ScoreListService scoreUserListBank = new ScoreListService();

    private List<User> userList;

    public void addScoreUserListBank(int idUser, double balance) {
        scoreUserListBank.addScoreUserListBank(userList, idUser, balance);
    }

    public void printScoreUserListBank() {
        scoreUserListBank.printScoreUserListBank();
    }

    public void conCatUsersScores(List<User> userListBank) {
        this.userList = userListBank;
    }

    public void withdrawalScoreUser(int idUser, int idScore, double payment) {
        scoreUserListBank.withdrawalScoreUser(idUser, idScore, payment);
    }

    public void depositFundsScoreUser(int idUser, int idScore, double payment) {
        scoreUserListBank.depositFundsScoreUser(idUser, idScore, payment);
    }

}
