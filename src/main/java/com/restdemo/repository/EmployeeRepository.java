package com.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restdemo.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
