package com.syed.java.streams.integers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortIntegerArray {
    public static void main(String[] args) {
        int[] intArr = {7,5,4,6,1,3,2};

        List<Integer> list = Arrays.asList(7,5,4,6,1,3,2);

        Set<Integer> collect = list.stream().sorted().collect(Collectors.toSet());
        System.out.println(collect);

//         int[] sortedArray = Arrays.stream(intArr)
//                .sorted()
//                 .toArray();
//
//        System.out.println(Arrays.toString(sortedArray));


    }
}
