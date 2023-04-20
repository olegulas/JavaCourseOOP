package main.java.model;

import java.util.Iterator;

public class User implements Iterator<Object> {
    private int idUser;
    private String name;
    private double resultBalance;

    public User(int idUser, String name) {
        this.setIdUser(idUser);
        this.setName(name);
        this.setResultBalance(0);
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setResultBalance(double resultBalance) {
        this.resultBalance = resultBalance;
    }

    public double getResultBalance() {
        return resultBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser='" + this.getIdUser() + '\'' +
                "name='" + this.getName() + '\'' +
                ", resultBalance=" + this.getResultBalance() +
                '}';
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 2;
    }

    @Override
    public Object next() {
        return switch (index) {
            case 1 -> this.getIdUser();
            case 2 -> this.getName();
            default -> this.getResultBalance();
        };
    }
}
