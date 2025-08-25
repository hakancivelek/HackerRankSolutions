package com.hakancivelek.java.dataStructures.sort;

/**
 * Represents a student with an ID, first name, and CGPA.
 * Implements the Comparable interface to define custom sorting logic.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
public class Student implements Comparable<Student> {
    int id;
    String firstName;
    double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    /**
     * Compares this Student object with another Student object for sorting purposes.
     * <ul>
     * <li>First, compares by CGPA in descending order.</li>
     * <li>If CGPAs are equal, compares by first name in alphabetical order.</li>
     * <li>If both CGPA and first name are equal, compares by ID in ascending order.</li>
     * </ul>
     *
     * @param other the other Student object to compare to
     * @return a negative integer, zero, or a positive integer as this Student is less than,
     *         equal to, or greater than the specified Student
     */
    @Override
    public int compareTo(Student other) {
        int cgpaComparison = Double.compare(other.cgpa, this.cgpa);
        if (cgpaComparison != 0) {
            return cgpaComparison;
        }

        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        return Integer.compare(this.id, other.id);
    }
}
