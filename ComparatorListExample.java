package com.example.seleniumdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}

// Comparator to sort employees by salary in descending order
class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}

// Comparator to sort employees by name alphabetically
class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

public class ComparatorListExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 70000));
        employees.add(new Employee("Bob", 60000));

        // Sorting by salary (descending)
        Collections.sort(employees, new SalaryComparator());
        System.out.println("Employees sorted by salary (descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting by name (alphabetically)
        Collections.sort(employees, new NameComparator());
        System.out.println("\nEmployees sorted by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
