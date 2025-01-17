package com.syed.java.intey;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
    public static void main(String[] args) {
        int[] intArr ={2,2,1,1,4,4,4,7,7,7,7};


        List<Integer> collect = Arrays.stream(intArr).boxed()
                .collect(Collectors.toList());

        Map<Integer, Long> collect1 = collect.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Integer key = collect1.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(key);

//        System.out.println(collect1);
//
//
//        System.out.println(collect);
//        List<Integer> collect = Arrays.stream(intArr).boxed()
//                .collect(Collectors.toList());

//        Map<Integer, Long> collect1 = collect.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//
//        Integer key = collect1.entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .get()
//                .getKey();
//
//
//        System.out.println(key);
//        System.out.println(collect1);

//        System.out.println(collect);



    }
}
