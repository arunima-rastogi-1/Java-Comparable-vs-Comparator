package com.example.seleniumdemo;

import java.util.Arrays;
import java.util.Comparator;

class StaffMember {
    private String name;
    private double salary;

    public StaffMember(String name, double salary) {
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
class StaffSalaryComparator implements Comparator<StaffMember> {
    public int compare(StaffMember s1, StaffMember s2) {
        return Double.compare(s2.getSalary(), s1.getSalary());
    }
}

// Comparator to sort employees by name alphabetically
class StaffNameComparator implements Comparator<StaffMember> {
    public int compare(StaffMember s1, StaffMember s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class ComparatorArrayExample {
    public static void main(String[] args) {
        StaffMember[] employees = {
                new StaffMember("John", 50000),
                new StaffMember("Alice", 70000),
                new StaffMember("Bob", 60000)
        };

        // Sorting by salary (descending)
        Arrays.sort(employees, new StaffSalaryComparator());
        System.out.println("Employees sorted by salary (descending):");
        for (StaffMember e : employees) {
            System.out.println(e);
        }

        // Sorting by name (alphabetically)
        Arrays.sort(employees, new StaffNameComparator());
        System.out.println("\nEmployees sorted by name:");
        for (StaffMember e : employees) {
            System.out.println(e);
        }
    }
}
