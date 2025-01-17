package com.syed.java.streams.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class containsDuplicate {

    public static boolean containsDuplicate(int[] arr){

        Set<Integer> arrSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        Set<Integer> set = new HashSet<>(arrSet);


        if(set.size() == arrSet.size()){
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
//        System.out.println(containsDuplicate(new int[]{1,2,3,4}));

//        List<Integer> myList = Arrays.asList(1,2,2,3,3,4,4,8,9,9);

//        Set<Integer> set = new HashSet<>(myList);
//
//        set.stream().filter(n->!myList.contains(n)).forEach(System.out::println);

//        System.out.println(set);
    }
}
