package com.example.tabe.model.people;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import com.example.tabe.model.leave.Leave;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 4892450628335965270L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	@Id
    public long employeeId;
	

    @Column(name="name")
    @NotNull()
    private String name;

    @Column(name="last_name")
    @NotNull
    private String lastName;

    @NotNull
    @Column(name="phone_number")
    private long phoneNumber;

   // @Column(name="leave")
    //@ManyToMany
    //@NotNull
//    private Leave leave;

    @Column(name = "title")
    private String title;

    
    @Column(name = "id_number")
    private int idNumber;

    @Column(unique=true, name="employee_Email")
    private String employeeEmail;
   
   
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

    public long getEmployeeId() {
        return employeeId;
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
        return idNumber;
    }

    public void setIDnumber(int iDnumber) {
        idNumber = iDnumber;
    }
    
    public Employee register(Employee emp){
        return emp;
    }
    
    

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
