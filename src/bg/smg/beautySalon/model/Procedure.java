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
public class Procedure {
    private int ID;
    private String procedureName;
    private double price;
    private Category category;
    Procedure(){

    }

    public Procedure(int ID, String procedureName, double price, Category category) {
        this.ID = ID;
        this.procedureName = procedureName;
        this.price = price;
        this.category = category;
    }

    public int getID() {
    return ID;
    }

    public void setID(int iD) {
    ID = iD;
    }

    public String getProcedureName() {
    return procedureName;
    }

    public void setProcedureName(String procedureName) {
    this.procedureName = procedureName;
    }


    public double getPrice() {
    return price;
    }

    public void setPrice(double price) {
    this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Procedure{" + "ID=" + ID + ", procedureName=" + procedureName + ", price=" + price + ", category=" + category + '}';
    }
    
}
