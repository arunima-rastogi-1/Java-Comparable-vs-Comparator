package com.example.seleniumdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class student implements Comparable<student> {
    private String name;
    private int marks;

    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    // Implement compareTo() to sort students by marks in ascending order
    @Override
    public int compareTo(student s) {
        return this.marks - s.marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class ComparableListExample {
    public static void main(String[] args) {
        List<student> students = new ArrayList<>();
        students.add(new student("Alice", 85));
        students.add(new student("Bob", 90));
        students.add(new student("Charlie", 80));

        // Sorting using Comparable
        Collections.sort(students);

        // Display sorted list
        System.out.println("Students sorted by marks:");
        for (student s : students) {
            System.out.println(s);
        }
    }
}
