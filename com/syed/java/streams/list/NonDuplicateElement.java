package com.syed.java.streams.list;

import java.util.*;
import java.util.stream.Collectors;

public class NonDuplicateElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,1,2,2,3,3,5,6,6,7,7);

        Set<Integer> uniqueElement = new HashSet<>();

        Set<Integer> duplicateElement = new HashSet<>();

        myList.forEach(n-> {
            if(!uniqueElement.add(n)){
                duplicateElement.add(n);
            }
        });

        Set<Integer> nonRepeatedElement = uniqueElement.stream()
                        .filter(n -> !duplicateElement.contains(n))
                                .collect(Collectors.toSet());

        System.out.println("Non repeated element "+ nonRepeatedElement);


        System.out.println("Unique " + uniqueElement);
        System.out.println("Duplicate " + duplicateElement);
    }
}
