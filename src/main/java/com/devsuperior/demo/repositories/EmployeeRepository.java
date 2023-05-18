package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
