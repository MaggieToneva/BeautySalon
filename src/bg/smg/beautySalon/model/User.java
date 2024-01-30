/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.beautySalon.model;

/**
 *
 * @author n.m.borisova
 */

import java.util.Base64;

public class User {
    private int ID; 
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;

    public User() {
        this.name = "";
        this.email = "";
        this.password = "";
        this.phoneNumber = "";
        this.role = new Role();
    }

    public User(String name, String email, String password, Role role) {
        this.name=name;
        this.email = email;
        this.password=password;
        this.phoneNumber = "";
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role= role;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", name=" + name + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", role=" + role + '}';
    }

    
}

    
