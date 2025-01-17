package com.syed.java.interviewquestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueElement {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,1,2,2,3,3,4,4,8,8,54,9,9);

        Set<Integer> uniqueElement = new HashSet<>();
        Set<Integer> duplicateElement = new HashSet<>();

        myList.forEach(n->{
            if(!uniqueElement.add(n)){
                duplicateElement.add(n);
            }
        });

        uniqueElement.stream()
                .filter(n-> !duplicateElement.contains(n))
                .forEach(System.out::println);

        System.out.println("Unique "+uniqueElement);
        System.out.println("Dup[licate "+duplicateElement);
    }
}
