package com.hakancivelek.java.dataStructures.sort;

import java.util.*;

/**
 * Solution class to demonstrate the sorting of a list of Student objects
 * based on the provided rules:
 * <ul>
 * <li>Sort by CGPA in descending order.</li>
 * <li>If CGPAs are the same, sort by first name in alphabetical order.</li>
 * <li>If both CGPA and first name are the same, sort by ID in ascending order.</li>
 * </ul>
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String firstName = scanner.next();
            double cgpa = scanner.nextDouble();
            students.add(new Student(id, firstName, cgpa));
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.firstName);
        }
    }
}
