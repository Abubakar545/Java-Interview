package com.syed.java.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        int[] intArr = {10,15,8,49,25,98,98,32,15};

//        Arrays.stream(intArr).sorted().forEach(System.out::println);
//        myList.stream().sorted().forEach(System.out::println);
//        System.out.println(Arrays.toString(intArr));

//        List<Integer> collect = Arrays.stream(intArr).boxed().collect(Collectors.toList());

//        List<Integer> collect1 = collect.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect1);
//        System.out.println(collect);


    }
}
