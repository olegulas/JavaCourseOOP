package main.java.view;

import main.java.controller.ScoreController;
import main.java.controller.UserController;
import main.java.model.Score;
import main.java.model.User;
import main.java.service.UserListService;

import java.util.ArrayList;
import java.util.List;

public class UserView {
//  Реализовать систему работы банковского приложения.
//- Создать класс пользователь и соответсвующие классы
//- Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно быть отдельное поле - его балланс)
//- Реализовать функции добавления и удаления пользователя
    public static void main(String[] args) {
        UserController userList = new UserController();
        ScoreController userScoreList = new ScoreController();

        userList.addUserListBank("Иван", 32);
        userList.addUserListBank("Степа", 33);
        userList.getUserListBank().get(0).addScoreList(new Score(1, 0, 1000));
        userList.getUserListBank().get(0).addScoreList(new Score(2, 0,2000));
        System.out.println(userList.getUserListBank());
    }
}