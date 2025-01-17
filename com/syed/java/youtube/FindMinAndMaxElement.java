package com.syed.java.youtube;


import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

//Find the minimum and maximum of element using Java 8 streams
public class FindMinAndMaxElement {
    public static void main(String[] args) {
//        10,15,8,49,25,98,98,32,15
        List<Integer> list = Arrays.asList( 10,15,8,49,25,98,98,32,15);


        Integer i1 = list.stream().min(Integer::compare).get();
        System.out.println(i1);

//        List<Integer> list1 = List.of( 10,15,8,49,25,98,98,32,15);


//        int[] intArr = {10,15,8,49,25,98,98,32,15};
//
//        int i = Arrays.stream(intArr)
//                .min()
//                .orElseThrow(NoSuchElementException::new);
//
//        System.out.println(i);

    }
}
