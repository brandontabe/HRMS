package com.example.tabe.controller;

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
import com.example.tabe.model.people.Person;
import com.example.tabe.service.EmployeeService;

@Component
@RestController
@RequestMapping(path = "/hrms/")
public class EmployeeController {

@Autowired
EmployeeService employeeService;

@GetMapping (path = "/test/")
public String test() {
	
	return "hello wold";
}

@PostMapping(path = "/addEmployee")
public String AddEmployee(@Valid @RequestBody Person employee){

employeeService.save(employee);

    return "NEW EMPLOYEE ADDED";
}

@CrossOrigin
@DeleteMapping(path = "/deleteEmployee/{id}")
public String deleteEmployee(@PathVariable long id){
    employeeService.deleteById(id);
    return "Employee deleted";
}

@CrossOrigin
@GetMapping(path = "/listEmployees")
public List<Person> listEmployees(){
	System.out.println("debug mode");
    List <Person> empArr = (List<Person>) employeeService.findAll();
    return empArr;
}



@CrossOrigin
@GetMapping(path = "/findEmployee/{id}")
public Optional <Person> findEmployeeById(@PathVariable long id){
     
        Optional<Person> emp = employeeService.findById(id);
    
    return emp;
}

	@CrossOrigin
	@PutMapping(path = "/updateEmployee")
	public Boolean updateEmployee(@RequestBody Person emp) {
		Optional<Person> employee = employeeService.findById(emp.getId());
		System.out.println(".............................."+emp);
		if (employee.isPresent()) {
			Person updatedEmployee = employee.get();
			// updatedTask.setDescription(task.getDescription());
			// updatedTask.setDueDate(task.getDueDate());
			employeeService.save(updatedEmployee);
			return true;
		}
		return false;
	}

    
}