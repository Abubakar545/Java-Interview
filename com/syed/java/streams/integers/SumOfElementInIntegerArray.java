package com.syed.java.streams.integers;

import java.util.Arrays;

public class SumOfElementInIntegerArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

//        int[] array = Arrays.stream(intArray).map(n -> n + n).toArray();
//        System.out.println(Arrays.toString(array));
        int sum = Arrays.stream(intArray).sum();
        System.out.println(sum);

//        List<Integer> list = List.of(1,2,3,4,5);
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//
//        int max = list.stream()
//                .mapToInt(Integer::intValue)
//                        .sum();
//
//        System.out.println(max);

    }
}
