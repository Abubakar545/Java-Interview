package com.syed.java.streams.list;

import java.util.Arrays;
import java.util.List;

public class FindLastElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);


        myList.stream()
                .reduce((s1, s2)->s2)
                .ifPresent(System.out::println);
//        Collections.reverse(myList);
//        myList.stream()
//                .findFirst()
//                .ifPresent(System.out::println);

    }
}
