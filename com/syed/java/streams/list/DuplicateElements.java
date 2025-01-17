package com.syed.java.streams.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

       //duplicate
        Set<Integer> set = new HashSet<>();

       myList.stream()
               .filter(s-> !set.add(s))
               .forEach(System.out::println);

    }
}
