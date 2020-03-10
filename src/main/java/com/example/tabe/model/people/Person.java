package com.example.tabe.model.people;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

//import com.example.tabe.model.leave.Leave;

@Entity
public abstract class Person implements Serializable {

    private static final long serialVersionUID = 4892450628335965270L;

    @GeneratedValue
    @Id
    public long id;

    @Column(name="name")
    @NotNull()
    private String name;

    @Column(name="last_name")
    @NotNull
    private String lastName;

    @Column(name="employee_id")
    @NotNull
    private String employeeId;

    @NotNull
    @Column(name="phone_number")
    private long phoneNumber;

   // @Column(name="leave")
    //@ManyToMany
    //@NotNull
//    private Leave leave;

    @Column(name = "title")
    private String title;

    public enum EMPLOYEE_TYPE {
        PERMANENT, CONTRACTOR
    }

    @Column(name = "id_number")
    @NotNull
    private long IDnumber;

    public enum Department {
        TECHNOLOGY, MARKETING, RETAIL, HOUSEKEEPING, ADMIN
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
   // public Leave getLeave() {
      //  return leave;
    //}

   // public void setLeave(Leave leave) {
     //   this.leave = leave;
    //}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(long iDnumber) {
        IDnumber = iDnumber;
    }
    
    public Employee register(Employee emp){
        return emp;
    }

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
