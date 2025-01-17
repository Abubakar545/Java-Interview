package com.syed.java.streams.integers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Integer[] salaries = {10000, 12000, 8000, 45000, 20000, 50000};

        List<Integer> collect = Arrays.stream(salaries)
                .collect(Collectors.toList());

        collect.stream()
                .sorted()
//                .skip(1)
//                .limit(1)
                        .forEach(System.out::println);


//        System.out.println(collect);
    }
}
