package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromAList {
    public static void main(String[] args) {
        List<String> listOfIntegers = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> collect = listOfIntegers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
