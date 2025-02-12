package com.example.seleniumdemo;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.id, s.id); // Sort by student ID (ascending)
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

public class ComparableHashMapExample {
    public static void main(String[] args) {
        Map<Student, Integer> studentScores = new HashMap<>();
        studentScores.put(new Student("Alice", 3), 85);
        studentScores.put(new Student("Bob", 1), 90);
        studentScores.put(new Student("Charlie", 2), 80);

        // Convert HashMap to TreeMap to sort by Student ID
        Map<Student, Integer> sortedMap = new TreeMap<>(studentScores);

        System.out.println("Students sorted by ID:");
        for (Map.Entry<Student, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Score: " + entry.getValue());
        }
    }
}
