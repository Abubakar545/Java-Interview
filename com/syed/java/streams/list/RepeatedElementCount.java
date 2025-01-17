package com.syed.java.streams.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElementCount {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 3, 1, 4, 4, 1, 4, 333, 3, 333, 2, 2, 2, 5, 222);

       Map<Integer, Long> elementCount= myList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(elementCount);

        int mostRepeatedElement = elementCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("mostRepeatedElement "+mostRepeatedElement);
    }
}
