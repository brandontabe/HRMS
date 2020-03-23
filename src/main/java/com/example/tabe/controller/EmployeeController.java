package com.example.tabe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tabe.model.people.Employee;
import com.example.tabe.model.people.User;
import com.example.tabe.repository.EmployeeRepository;
import com.example.tabe.repository.UserRepository;

@Component
@RestController
@RequestMapping(path = "/hrms/")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeService;

	@Autowired
	UserRepository userRepo;

	@CrossOrigin
	@PostMapping(path = "/login/")
	public boolean test(@Valid @RequestBody User user) {
		boolean userLock = false;
		List<User> users = new ArrayList<User>();

		users = userRepo.findAll();

		for (User u : users) {

			if (u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
				userLock = true;
				user.setActive(true);
				u.setActive(true);
			}

			else {
				user.setActive(false);
				u.setActive(false);
			}
		}
		return userLock;
	}

	@CrossOrigin
	@PostMapping(path = "/addEmployee")
	public Employee AddEmployee(@Valid @RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}

	@CrossOrigin
	@DeleteMapping(path = "/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable long id) {
		employeeService.deleteById(id);
		return "Employee deleted";
	}

	@CrossOrigin
	@GetMapping(path = "/listEmployees")
	public List<Employee> listEmployees() {
		List<Employee> empArr = (List<Employee>) employeeService.findAll();
		return empArr;
	}

	@CrossOrigin
	@GetMapping(path = "/findEmployee/{id}")
	public Optional<Employee> findEmployeeById(@PathVariable long id) {

		Optional<Employee> emp = employeeService.findById(id);

		return emp;
	}

	@CrossOrigin
	@PutMapping(path = "/updateEmployee")
	public Boolean updateEmployee(@RequestBody Employee emp) {
		Optional<Employee> employee = employeeService.findById(emp.getId());
		System.out.println(".............................." + emp);
		if (employee.isPresent()) {
			Employee updatedEmployee = employee.get();
			employeeService.save(updatedEmployee);
			return true;
		}
		return false;
	}

}
