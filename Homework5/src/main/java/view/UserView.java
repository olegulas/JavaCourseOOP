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

        System.out.println("Добавляем пользователей и их счета");
        userList.addUserListBank("Иван");
        userList.addUserListBank("Степа");
        userList.addUserListBank("Сергей");
        userList.addUserListBank("Андрей");
        userList.addUserListBank("Максим");

        scoreList.addScoreUserListBank(1, 300);
        scoreList.addScoreUserListBank(1, 500);
        scoreList.addScoreUserListBank(5, 2000);

        userList.printUserListBank();
        System.out.println("Просматриваем счета пользователей");
        scoreList.printScoreUserListBank();

        System.out.println("Удаляем пользователя № 4");
        userList.removeUserListBank(4);
        userList.printUserListBank();

        System.out.println("Добавляем пользователя Георгий");
        userList.addUserListBank("Георгий");
        userList.printUserListBank();

        System.out.println("Удаляем пользователя № 0 и 1");
        userList.removeUserListBank(1);
        userList.removeUserListBank(0);
        userList.printUserListBank();

        System.out.println("Добавляем счета пользователю № 6");
        scoreList.addScoreUserListBank(6, 2000);
        scoreList.addScoreUserListBank(6, 5000);
        scoreList.printScoreUserListBank();
        userList.printUserListBank();

        System.out.println("Списываем/начисляем на счёт пользователя № 6");
        scoreList.withdrawalScoreUser(6,4,100);
        scoreList.depositFundsScoreUser(6,5,5000);
        scoreList.printScoreUserListBank();
    }
}