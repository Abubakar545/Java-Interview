//package com.syed.java.interviewquestion.comparablevscomparator;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class StudentComparator  implements Comparator<StudentComparator> {
//        private String name;
//        private int marks;
//
//        public StudentComparator(String name, int marks){
//            this.name = name;
//            this.marks = marks;
//        }
//
//        public String getName(){
//            return name;
//        }
//
//        public int marks(){
//            return marks;
//        }
//
//
//    @Override
//    public int compare(StudentComparator o1, StudentComparator o2) {
//        return 0;
//    }
//
//
//        @Override
//        public String toString(){
//            return name+" : "+marks;
//        }
//
//        public static void main(String[] args) {
//
//            List<StudentComparator> students = new ArrayList<>();
//            students.add(new StudentComparator("Syed", 07));
//            students.add(new StudentComparator("Abubakar", 45));
//            students.add(new StudentComparator("Siddiq", 99));
//
//
//            Collections.sort(students, new StudentComparator());
//
//            System.out.println(students);
//        }
//
//
//}
//
