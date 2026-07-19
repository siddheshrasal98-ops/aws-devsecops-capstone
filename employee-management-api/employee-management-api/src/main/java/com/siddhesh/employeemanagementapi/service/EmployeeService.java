package com.siddhesh.employeemanagementapi.service;

import com.siddhesh.employeemanagementapi.entity.Employee;
import com.siddhesh.employeemanagementapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class EmployeeService {
    private static final Logger logger =
            LoggerFactory.getLogger(EmployeeService.class);

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
    logger.info("Fetching all employees");
    return employeeRepository.findAll();
}

    public Employee saveEmployee(Employee employee) {
        logger.info("Saving employee: {}", employee.getName());
        return employeeRepository.save(employee);
    }

public Employee getEmployeeById(Long id) {
    logger.info("Fetching employee by ID: {}", id);
    return employeeRepository.findById(id).orElse(null);
}
public Employee updateEmployee(Long id, Employee updatedEmployee) {
    logger.info("Updating employee with ID: {}", id);
    Employee employee = employeeRepository.findById(id).orElse(null);
    

    if (employee != null) {
        employee.setName(updatedEmployee.getName());
        employee.setDepartment(updatedEmployee.getDepartment());
        employee.setSalary(updatedEmployee.getSalary());

        return employeeRepository.save(employee);
    }

    return null;
}
public void deleteEmployee(Long id) {
    logger.info("Deleting employee with ID: {}", id);
    employeeRepository.deleteById(id);
    
}
}