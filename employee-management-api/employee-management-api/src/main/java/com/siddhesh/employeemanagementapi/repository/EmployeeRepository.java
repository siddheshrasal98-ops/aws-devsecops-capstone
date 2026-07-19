package com.siddhesh.employeemanagementapi.repository;

import com.siddhesh.employeemanagementapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}