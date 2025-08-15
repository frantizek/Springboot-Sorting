package com.example.demo.employee;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int experience;

    public Employee(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getExperience() { return experience; }

    @Override
    public int compareTo(Employee other) {
        return Comparator.comparingInt(Employee::getAge)
                .compare(this, other);
    }

    @Override
    public String toString() {
        return name + ", Age: " + age + " Yrs, Exp: " + experience + " Yrs";
    }
}