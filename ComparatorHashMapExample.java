package com.example.seleniumdemo;

import java.util.*;

public class ComparatorHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 80);

        // Convert HashMap entries to a List
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(scores.entrySet());

        // Sort list by values in descending order
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Students sorted by score (descending):");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " -> Score: " + entry.getValue());
        }
    }
}
