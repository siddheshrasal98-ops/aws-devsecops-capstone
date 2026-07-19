package com.siddhesh.employeemanagementapi.controller;

import com.siddhesh.employeemanagementapi.entity.Employee;
import com.siddhesh.employeemanagementapi.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public Employee saveEmployee(@Valid@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
@GetMapping("/{id}")
public Employee getEmployeeById(@PathVariable Long id) {
    return employeeService.getEmployeeById(id);
}
@PutMapping("/{id}")
public Employee updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee) {
    return employeeService.updateEmployee(id, employee);
}
@DeleteMapping("/{id}")
public void deleteEmployee(@PathVariable Long id) {
    employeeService.deleteEmployee(id);
}
}