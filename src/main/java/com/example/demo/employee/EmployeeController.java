package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployeesSortedByAge();
    }

    @GetMapping("/")
    public String printEmployees() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of candidates appearing for interview (sorted by age):\n");
        employeeService.getAllEmployeesSortedByAge()
                .forEach(emp -> sb.append(emp.toString()).append("\n"));
        return sb.toString();
    }
}