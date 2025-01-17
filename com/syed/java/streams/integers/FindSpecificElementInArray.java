package com.syed.java.streams.integers;

import java.util.Arrays;

public class FindSpecificElementInArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,3,4,5};

        int targetElement = 3;

        long count = Arrays.stream(intArr)
                .filter(n -> n == targetElement).count();

        System.out.println(count);
//                .toArray();
//        System.out.println(Arrays.toString(array));
    }
}
