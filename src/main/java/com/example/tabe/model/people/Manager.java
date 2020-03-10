package com.example.tabe.model.people;

import javax.persistence.Entity;
import javax.persistence.Table;

//import com.example.tabe.model.leave.Leave;

@Entity
@Table(name="Manager")
public class Manager extends Employee implements Managable{

    /**
     *
     */
    private static final long serialVersionUID = -7308868860921811998L;
    
    public enum MANAGERIAL_LEVEL{SENIOR,INTERMEDIATE,JUNIOR};
    private MANAGERIAL_LEVEL level;
    
   // public Leave leaveDecision(Leave leave) {

     //   return leave;
    //}

    public boolean reviewEmployee(Employee emp){

        return false;
    }

    public MANAGERIAL_LEVEL getLevel() {
        return level;
    }

    public void setLevel(MANAGERIAL_LEVEL level) {
        this.level = level;
    }



    
}