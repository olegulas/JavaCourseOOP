package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class User implements UserInterface {
    private String name;
    private int age;
    private double resultBalance = 0;
    private List<Score> scoreList = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    @Override
    public void addScoreList(Score score) {
        this.scoreList.add(score);
        this.calcResultScore(this.getScoreList());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", resultBalance=" + resultBalance +
                ", scoreList=" + scoreList +
                '}';
    }

    public void setResultBalance(double resultBalance) {
        this.resultBalance = resultBalance;
    }

    public double getResultBalance() {
        return resultBalance;
    }

    @Override
    public void calcResultScore(List<Score> scoreList) {
        double result = 0;
        for (Score score : scoreList) {
            result += score.getBalanceScore();
        }
        this.setResultBalance(result);
    }
}
