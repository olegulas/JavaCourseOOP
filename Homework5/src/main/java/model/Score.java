package main.java.model;

public class Score {
    private int idScore;
    private int idUser = 0;
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

    public void withdrawalScore(double payment){
        this.setBalanceScore(this.getBalanceScore() - payment);
    }

    public Score(int idScore, int idUser, double balanceScore) {
        this.idScore = idScore;
        this.setIdUser(idUser);
        this.balanceScore = balanceScore;
    }
}
