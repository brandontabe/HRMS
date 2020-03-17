package com.example.tabe.model.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="User")
public class User {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5226699767514356832L;


	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	@Id
	private long uuid;
	
	@Column(name="is_active")
	
	private boolean isActive=false;
	
	@Column(unique = true, name="email")
	@NotNull
	private String email;
	
	@Column
	@NotNull
	private String password;
	
	@Column
	private String inputEmail;
	
	@Column 
	private String inputPassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}

	public String getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
	}

	public long getUuid() {
		return uuid;
	}

	public void setUuid(long uuid) {
		this.uuid = uuid;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
