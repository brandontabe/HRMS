package com.example.tabe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tabe.model.people.User;

/**
 * EmployeeService
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
}

    
