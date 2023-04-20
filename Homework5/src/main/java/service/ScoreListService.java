package main.java.service;

import main.java.model.Score;
import main.java.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ScoreListService implements Iterator<Score> {
    private final List<Score> scoreUserListBank;

    public ScoreListService() {
        this.scoreUserListBank = new ArrayList<>();
    }

    public List<Score> getScoreUserListBank() {
        return scoreUserListBank;
    }

    public void addScoreUserListBank(List<User> usrList, int idUser, double balance) {
        boolean isExistUser = false;
        for (User user : usrList) {
            if (user.getIdUser() == idUser) {
                isExistUser = true;
                scoreUserListBank.add(new Score(scoreUserListBank.size() + 1, idUser, balance));
            }
        }
        if (!isExistUser) System.out.printf("User ID:%d not exist\n", idUser);
    }

    public void printScoreUserListBank() {
        for (Score score : scoreUserListBank) {
            System.out.println(score.toString());
        }
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < scoreUserListBank.size();
    }

    @Override
    public Score next() {
        return this.scoreUserListBank.get(index);
    }
}
