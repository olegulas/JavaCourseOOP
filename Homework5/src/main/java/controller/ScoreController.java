package main.java.controller;

import main.java.model.Score;
import main.java.model.User;
import main.java.service.ScoreListService;
import java.util.List;

public class ScoreController {
    private final ScoreListService scoreUserListBank = new ScoreListService();

    private List<User> userList;

    public List<Score> getScoreUserListBank() {
        return scoreUserListBank.getScoreUserListBank();
    }

    public void addScoreUserListBank(int idUser, double balance) {
        scoreUserListBank.addScoreUserListBank(userList, idUser, balance);
    }

    public void printScoreUserListBank() {
        scoreUserListBank.printScoreUserListBank();
    }

    public void conCatUsersScores(List<User> userListBank){
        this.userList = userListBank;
    }
}
