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

import java.sql.SQLException;

public interface UserServiceI {
    public void saveUser(User user) throws Exception;
    public User getUser(int id);
    public User getUserByEmail(String username) throws SQLException;
    public boolean verifyUser(User user) throws SQLException;
}

