package com.syed.java.interviewquestion.comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Student class without implementing Comparable interface
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

// Comparator to compare students by grade
class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getGrade(), s2.getGrade());
    }
}

// Comparator to compare students by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

// Comparator to compare students by name in descending order
class NameDescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s2.getName().compareTo(s1.getName());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 92));
        students.add(new Student("David", 85));

        // Sort by grade using GradeComparator
        Collections.sort(students, new GradeComparator());
        System.out.println("Sorted by grade: " + students);

        // Sort by name using NameComparator
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by name: " + students);

        // Sort by name in descending order using NameDescendingComparator
        Collections.sort(students, new NameDescendingComparator());
        System.out.println("Sorted by name (descending): " + students);
    }
}
