package com.syed.java.streams.integers;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageOfElementInIntegerArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        OptionalDouble average = Arrays.stream(intArray).average();
        System.out.println(average);
    }
}
