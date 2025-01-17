package com.syed.java.streams.list;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfTotalNumberOfElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

       OptionalDouble avg = myList.stream()
               .mapToInt(Integer::intValue)
               .average();

        System.out.println(avg);
    }
}
