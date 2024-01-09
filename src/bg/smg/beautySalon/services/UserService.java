/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.beautySalon.services;

/**
 *
 * @author n.m.borisova
 */

import bg.smg.beautySalon.model.User;
import bg.smg.beautySalon.util.DBManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

public class UserService implements UserServiceI {
    private DataSource dataSource;
    private Connection connection;

    public UserService() throws SQLException {
        dataSource = DBManager.getInstance().getDataSource();
    }
    @Override
    public void saveUser(User user) throws Exception{
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO `user`(`name`,`email`, `password`) VALUES ('"+user.getName()+"','"+ user.getEmail() +"', '"+user.getPassword()+"')")){
                statement.setString(1, user.getName());
                statement.executeQuery();
                
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                System.out.println("Closing database connection...");
                connection.close();
                System.out.println("Connection valid: " + connection.isValid(5));
            }
        }
    }

    @Override
    public User getUser(int id) {
        return null;
    }
    
    @Override
    public User getUserByEmail(String  email) throws SQLException {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM users WHERE email=?")) {
                statement.setString(1, email);
                ResultSet resultSet = statement.executeQuery();
                resultSet.first();
                User user = new User();
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                System.out.println("Closing database connection...");
                connection.close();
                System.out.println("Connection valid: " + connection.isValid(5));
            }
        }
        return null;
    }

    public String encode(String password){
        String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());
        return encodedPassword;
    }

    public boolean verifyUser(User user) throws SQLException {
        User registeredUser = getUserByEmail(user.getEmail());
        String encodedPwd = encode(user.getPassword());
        if(registeredUser != null && registeredUser.getPassword().equals(encodedPwd))
            return true;
        else
            return false;
    }

    public String decodePassword(String passwordToDecode){
        byte[] decodedBytes = Base64.getDecoder().decode(passwordToDecode);
        return new String(decodedBytes);
    }
}
