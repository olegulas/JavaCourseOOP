package main.java.service;

import main.java.controller.ScoreController;
import main.java.model.Score;
import main.java.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScoreListService implements Iterable{
    private final List<Score> scoreUserListBank = new ArrayList<>();

    public ScoreListService() {
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
