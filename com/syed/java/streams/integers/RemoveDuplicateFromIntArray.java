package com.syed.java.streams.integers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromIntArray {
    public static void main(String[] args) {
//        int[] intArr = {7,5,4,6,1,1,3,2,3,2};
//
//        int[] array = Arrays.stream(intArr).distinct().toArray();
//
//        System.out.println(Arrays.toString(array));

        List<Integer> myList = List.of(7,5,4,6,1,1,3,2,3,2);

        Set<Integer> set = new HashSet<>();

        Set<Integer> collect = myList.stream().filter(n -> set.add(n)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
