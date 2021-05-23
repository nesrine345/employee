package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/Test")
public class Controller {
	@Autowired
	EmployeeRepository employeeRep;

	// pour retourner tous les employeurs
	@GetMapping("/employers")
	public List<EmployeeEntity> getAllEmployeeEntities() {
		return employeeRep.findAll();
	}

	// afficher un employeur spécifié
	@PostMapping("/employers/{email}")
	public String getEmails(@RequestBody EmployeeEntity email) {
		return email.getEmail();
	}

	// delete employee
	@DeleteMapping("/employers/{email}")
	public void deleteEmpl(@PathVariable("id") long id) {
		employeeRep.deleteById(id);

	}

	// updating
	@PutMapping("/employers")
	public EmployeeEntity update(@RequestBody EmployeeEntity Employer) {
		return Employer;
	}

}
