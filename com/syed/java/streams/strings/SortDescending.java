package com.syed.java.streams.strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);


        Set<Integer> uniqueElement = new HashSet<>();
        Set<Integer> duplicateElement = new HashSet<>();

        myList.forEach(n->{
            if(!uniqueElement.add(n)){
                duplicateElement.add(n);
            }
        });


        Set<Integer> collect = uniqueElement.stream()
                .filter(n -> !duplicateElement.contains(n))
                .collect(Collectors.toSet());

        System.out.println(collect);


//        Stream<Integer> sorted = duplicateElement.stream().sorted();
//        System.out.println(Arrays.toString(sorted.toArray()));
//        System.out.println(duplicateElement);
//        Collections.reverse(myList);
//
//        Integer i = myList.stream().findFirst().orElse(null);
//        System.out.println(i);
//        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
