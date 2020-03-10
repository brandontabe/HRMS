package com.example.tabe.model.people;

import javax.persistence.Entity;
import javax.persistence.Table;

//import com.example.tabe.model.leave.Leave;

@Entity
@Table(name="Employee")
public class Employee extends Person {

    /**
     *
     */
    private static final long serialVersionUID = -4387898025201112494L;

//    public Leave requestLeave(Leave leave){
//        return leave;
 //   }

	public Long getId() {
		return this.id;
	}

}