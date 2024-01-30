/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.beautySalon.model;
import java.sql.Timestamp ;
/**
 *
 * @author smgBA8F
 */
public class Reservation {
    private int ID;
    private Timestamp dateAppointment;
    private User user;
    private Procedure procedure;

    public Reservation() {
    }

    public Reservation(int ID, Timestamp dateAppointment, User user, Procedure procedure) {
        this.ID = ID;
        this.dateAppointment = dateAppointment;
        this.user = user;
        this.procedure = procedure;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Timestamp getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(Timestamp dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    @Override
    public String toString() {
        return "Reservation{" + "ID=" + ID + ", dateAppointment=" + dateAppointment + ", user=" + user + ", procedure=" + procedure + '}';
    }

    
    
   
}
