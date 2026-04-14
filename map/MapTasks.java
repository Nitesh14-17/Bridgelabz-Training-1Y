import java.io.*;
import java.util.*;

public class MapTasks {
    public static void main(String[] args) throws IOException {
        // 1. Word Frequency Counter
        String text = "Hello world, hello Java!";
        Map<String, Integer> freq = new HashMap<>();
        for (String w : text.toLowerCase().replaceAll("[^a-z0-9 ]", "").split(" ")) {
            if (w.isEmpty()) continue;
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        System.out.println(freq);

        // 2. Invert a Map
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1); m1.put("B", 2); m1.put("C", 1);
        Map<Integer, List<String>> inv = new HashMap<>();
        for (var e : m1.entrySet()) {
            inv.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        System.out.println(inv);

        // 3. Find the Key with the Highest Value
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("A", 10); m2.put("B", 20); m2.put("C", 15);
        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;
        for (var e : m2.entrySet()) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
                maxKey = e.getKey();
            }
        }
        System.out.println(maxKey);

        // 4. Merge Two Maps
        Map<String, Integer> m3 = new HashMap<>();
        m3.put("A", 1); m3.put("B", 2);
        Map<String, Integer> m4 = new HashMap<>();
        m4.put("B", 3); m4.put("C", 4);
        Map<String, Integer> merged = new HashMap<>(m3);
        for (var e : m4.entrySet()) {
            merged.put(e.getKey(), merged.getOrDefault(e.getKey(), 0) + e.getValue());
        }
        System.out.println(merged);

        // 5. Group Objects by Property
        List<Employee> emps = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );
        Map<String, List<String>> byDept = new HashMap<>();
        for (Employee emp : emps) {
            byDept.computeIfAbsent(emp.dept, d -> new ArrayList<>()).add(emp.name);
        }
        for (var d : byDept.entrySet()) {
            System.out.print(d.getKey() + ": ");
            System.out.println(d.getValue());
        }

        // Student Grade Tracker
        Map<String, Double> grades = new HashMap<>();
        grades.put("Sam", 88.0); grades.put("Maya", 92.5); grades.put("Raj", 76.0);
        grades.put("Maya", 95.0);
        grades.remove("Raj");
        TreeMap<String, Double> sorted = new TreeMap<>(grades);
        for (var s : sorted.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

class Employee {
    String name;
    String dept;
    Employee(String n, String d) { name = n; dept = d; }
}
