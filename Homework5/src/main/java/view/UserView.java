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

        scoreList.addScoreUserListBank(1, 300);
        scoreList.addScoreUserListBank(1, 500);
        scoreList.addScoreUserListBank(5, 2000);

        userList.printUserListBank();
        scoreList.printScoreUserListBank();

        userList.removeUserListBank(4);
        userList.printUserListBank();

        userList.addUserListBank("Георгий");
        userList.printUserListBank();
        userList.removeUserListBank(1);
        userList.removeUserListBank(0);
        userList.printUserListBank();
        scoreList.addScoreUserListBank(6, 2000);
        scoreList.addScoreUserListBank(6, 5000);
        scoreList.printScoreUserListBank();
        userList.printUserListBank();

        scoreList.withdrawalScoreUser(6,4,100);
        scoreList.printScoreUserListBank();
        System.out.println();
    }
}