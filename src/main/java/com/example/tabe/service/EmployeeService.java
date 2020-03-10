package com.example.tabe.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tabe.model.people.Employee;
import com.example.tabe.model.people.Person;

/**
 * EmployeeService
 */
@Repository
public interface EmployeeService extends JpaRepository<Person,Long> {

    

}

    
