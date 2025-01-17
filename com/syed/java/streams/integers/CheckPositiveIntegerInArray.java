package com.syed.java.streams.integers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckPositiveIntegerInArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,-3,-7,4,-5};

        boolean b = Arrays.stream(intArr)
                .allMatch(n -> n > 0);

        System.out.println(b);

        List<Integer> list = List.of(1,2,-3,-7,4,-5);

        Set<Integer> collect = list.stream().filter(n -> n >= 0).collect(Collectors.toSet());

        System.out.println("Using List "+collect);
        int[] array = Arrays.stream(intArr)
                .filter(n -> n >= 0)
                .toArray();

        System.out.println("Using Integer "+Arrays.toString(array));
    }
}
