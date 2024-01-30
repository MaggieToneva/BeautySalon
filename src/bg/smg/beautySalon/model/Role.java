/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.beautySalon.model;

/**
 *
 * @author smgBA8F
 */

public class Role {
    private int ID;
    private String roleName;

    public Role() {
    }

    public Role(String roleName){
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" + "ID=" + ID + ", roleName=" + roleName + '}';
    }
    
    
    
}
