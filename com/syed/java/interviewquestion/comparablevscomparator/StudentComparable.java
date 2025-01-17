package com.syed.java.interviewquestion.comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable>{

    private String name;
    private int marks;

    public StudentComparable(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int marks(){
        return marks;
    }


    @Override
    public int compareTo(StudentComparable o) {
//        return Integer.compare(this.marks, o.marks);
//        return this.name.compareTo(o.name);
//        return Integer.compare(o.marks, this.marks);
        return o.name.compareTo(this.name);

    }



    @Override
    public String toString(){
        return name+" : "+marks;
    }

    static class  MarksComparator implements Comparator<StudentComparable> {

        @Override
        public int compare(StudentComparable o1, StudentComparable o2) {
            return Integer.compare(o1.marks, o2.marks);
        }
    }


    public  static void main(String[] args) {

        List<StudentComparable> students = new ArrayList<>();
        students.add(new StudentComparable("Syed", 07));
        students.add(new StudentComparable("Abubakar", 45));
        students.add(new StudentComparable("Siddiq", 99));


        Collections.sort(students, new MarksComparator());

        System.out.println(students);

    }

}
