package com.example.tabe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.tabe.model.people.Employee;
import com.example.tabe.model.people.User;

/**
 * EmployeeService
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	@Query("SELECT u.email FROM User u WHERE u.email LIKE :email AND u.password LIKE :password")
	public User login(@Param("email") String userEmail, @Param("password") String userPassword);
	

	
	
//	@Query("SELECT u.password FROM User u WHERE u.password LIKE :password")
//	public String findByPassword()
	
    

}

    
