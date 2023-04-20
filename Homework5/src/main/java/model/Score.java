package main.java.model;

import java.util.Iterator;

public class Score implements Iterator<Object> {
    private int idScore;
    private int idUser;
    private double balanceScore;

    @Override
    public String toString() {
        return "Score{" +
                "idScore=" + idScore +
                ", idUser=" + idUser +
                ", balanceScore=" + balanceScore +
                '}';
    }

    public int getIdScore() {
        return idScore;
    }

    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public double getBalanceScore() {
        return balanceScore;
    }

    public void setBalanceScore(double balanceScore) {
        this.balanceScore = balanceScore;
    }

    public void withdrawalScore(double outPayment) {
        this.setBalanceScore(this.getBalanceScore() - outPayment);
    }

    public void depositFundsScore(double inPayment) {
        this.setBalanceScore(this.getBalanceScore() + inPayment);
    }

    public Score(int idScore, int idUser, double balance) {
        this.setIdScore(idScore);
        this.setIdUser(idUser);
        this.setBalanceScore(balance);
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public Object next() {
        return switch (index) {
            case 1 -> this.getIdScore();
            case 2 -> this.getIdUser();
            default -> this.getBalanceScore();
        };
    }
}
