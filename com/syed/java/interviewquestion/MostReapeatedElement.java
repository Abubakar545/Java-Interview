package com.syed.java.interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostReapeatedElement {
    public static void main(String[] args) {
        int[] intArr ={1,2,2,3,3,3};

        List<Integer> collect = Arrays.stream(intArr).boxed().collect(Collectors.toList());

        Map<Integer, Long> collect1 = collect.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        System.out.println(collect1);

        Integer key = collect1.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(key);


    }
}
