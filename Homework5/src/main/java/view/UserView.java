package main.java.view;

import main.java.controller.ScoreController;
import main.java.controller.UserController;

public class UserView {
    //  Реализовать систему работы банковского приложения.
//- Создать класс пользователь и соответсвующие классы
//- Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно быть отдельное поле - его балланс)
//- Реализовать функции добавления и удаления пользователя
    public static void main(String[] args) {
        UserController userList = new UserController();
        ScoreController scoreList = new ScoreController();
        scoreList.conCatUsersScores(userList.getUserListBank());

        userList.addUserListBank("Иван");
        userList.addUserListBank("Степа");
        userList.addUserListBank("Сергей");
        userList.addUserListBank("Андрей");
        userList.addUserListBank("Максим");
        userList.printUserListBank();
        scoreList.addScoreUserListBank(1, 300);
        scoreList.addScoreUserListBank(5, 2000);
        scoreList.printScoreUserListBank();
    }
}