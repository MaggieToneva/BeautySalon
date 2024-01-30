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
public class Category {
    private int ID;
    private String categoryName;

    public Category() {
    }

    public Category(int ID, String categoryName) {
        this.ID = ID;
        this.categoryName = categoryName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" + "ID=" + ID + ", categoryName=" + categoryName + '}';
    }
   
}
