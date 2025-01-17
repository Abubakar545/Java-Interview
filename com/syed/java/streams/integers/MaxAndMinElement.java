package com.syed.java.streams.integers;

import java.util.*;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};



        int max = Arrays.stream(intArr)
                .max()
                .orElseThrow(NoSuchElementException::new);

        int min = Arrays.stream(intArr)
                .max()
                        .orElseThrow(NoSuchElementException::new);

        System.out.println("Min "+min+" Max "+max);
//        List<Integer> list = List.of(1,2,3,4,5);

//        Integer i = list.stream().max(Integer::compare).get();
//        System.out.println(i);
//
//        Integer i = list.stream().min(Integer::compare).get();
//        System.out.println(i);


    }
}
