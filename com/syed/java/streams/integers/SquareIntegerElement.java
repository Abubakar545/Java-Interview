package com.syed.java.streams.integers;

import java.util.Arrays;

public class SquareIntegerElement {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        int[] arr = Arrays.stream(intArr)
                .map(n-> n*n).toArray();

        System.out.println(Arrays.toString(arr));
//                .forEach(System.out::println);
    }

}
