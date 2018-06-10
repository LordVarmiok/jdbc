package dao;

import config.Database;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDao {

    //save
    //update
    //delete
    //findById
    //findAll

    private Database database = new Database();


    public User save(User user) throws SQLException {
        //insert
        //1. pobierz polaczenie
        Connection connection = database.getConnection();
        //2. napisz zapytanie
        /*
            MOZNA ZDROPOWAC BAZE DANYCH PISZAC "; DROP DATABASE"
        String sql = "INSERT INTO user (first_name, last_name, email) VALUES (" +
                user.getFirstName() + ", " +
                user.getLastName() + ", " +
                user.getEmail() + ")";
         */
        String sql = "INSERT INTO user(first_name, last_name, email) " + "VALUES (?, ?, ?)";

        //3. utworz obiekt PreparedStatement
        PreparedStatement statement = connection.prepareStatement(sql);

        //4. uzupelnij parametry zapytania
        statement.setString(1, user.getFirstName());
        statement.setString(2, user.getLastName());
        statement.setString(3, user.getEmail());

        //5. wykonaj zapytanie w bazie
        statement.executeUpdate();

        return user;

    }

    public void update(User user) {

    }

    public void delete(int id) {

    }

    public User findById(int id) {
        return null;
    }

    public List<User> findAll() {
        return null;
    }







}