package main.java.service;

import main.java.model.Score;
import main.java.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ScoreListService implements Iterator<Score> {
    private final List<Score> scoreUserListBank;

    private int indScore = 0;

    public ScoreListService() {
        this.setIndScore(0);
        this.scoreUserListBank = new ArrayList<>();
    }

    public int getIndScore() {
        return indScore;
    }

    public void setIndScore(int indScore) {
        this.indScore = indScore;
    }

    public void addScoreUserListBank(List<User> usrList, int idUser, double balance) {
        for (User user : usrList) {
            if (user.getIdUser() == idUser) {
                setIndScore(getIndScore() + 1);
                scoreUserListBank.add(new Score(getIndScore(), idUser, balance));
                user.setResultBalance(user.getResultBalance() + balance);
                return;
            }
        }
        System.out.printf("User ID:%d not exist\n", idUser);
    }

    public void withdrawalScoreUser(int idUser, int idScore, double payment) {
        for (Score score : getListUserScores(idUser)) {
            if (score.getIdScore() == idScore) {
                score.withdrawalScore(payment);
            }
        }
    }

    public void depositFundsScoreUser(int idUser, int idScore, double payment) {
        for (Score score : getListUserScores(idUser)) {
            if (score.getIdScore() == idScore) {
                score.depositFundsScore(payment);
            }
        }
    }

    public List<Score> getListUserScores(int idUser) {
        List<Score> userListScores = new ArrayList<>();
        for (Score user : scoreUserListBank) {
            if (user.getIdUser() == idUser) {
                userListScores.add(user);
            }
        }
        return userListScores;
    }

    public void printScoreUserListBank() {
        for (Score score : scoreUserListBank) {
            System.out.println(score.toString());
        }
        System.out.println();
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
