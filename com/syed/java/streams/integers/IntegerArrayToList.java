package com.syed.java.streams.integers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerArrayToList {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        List<Integer> list = Arrays.stream(intArray)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);


    }
}
