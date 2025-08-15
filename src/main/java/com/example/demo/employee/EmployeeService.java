package com.example.demo.employee;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<Employee> employees = Arrays.asList(
            new Employee("Sandhya", 20, 0),
            new Employee("Kemp", 24, 2),
            new Employee("Anil", 22, 3),
            new Employee("Kumar", 30, 6),
            new Employee("Tim", 32, 7)
    );

    public List<Employee> getAllEmployeesSortedByAge() {
        return employees.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}