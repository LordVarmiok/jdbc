package controller;

import dao.UserDao;
import model.User;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    UserDao userDao = new UserDao();

    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.wyswietlMenu();


        System.out.println("1 - Wyswietl menu");
        System.out.println("2 - Dodaj dane");
        System.out.println("3 - Update danych");
        System.out.println("4 - Usuniecie danych");
        System.out.println("5 - znajdz przez ID");
        System.out.println("6 - znajdz wszystkie");
        System.out.println("Q - wyjscie");


        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.next();

        do {
            switch (wybor) {
                case "1":
                    menu.wyswietlMenu();
                    break;
                case "2":
                    userDao.save();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "q":
                case "Q":
                    System.out.println("Wyjscie");
                    break;
            }
        } while (wybor.equals("q") || wybor.equals("Q"));



    }



    public void wyswietlMenu() throws SQLException {
        userDao.save(new User("Piotr", "Lichocik", "geemail@gmail.com"));
    }
}
