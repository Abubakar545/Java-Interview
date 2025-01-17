package com.syed.java.streams.integers;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOddFromIntArray {
    public static void main(String[] args) {
//        int[] intArr = {1,2,3,4,5,6,7,8};

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);


        List<Integer> set = list.stream().filter(n->n%2 !=0).collect(Collectors.toList());
        System.out.println(set);

//        int[] evenNumber = Arrays.stream(intArr)
//                .filter(n -> n % 2 == 0)
//                .toArray();
//
//        System.out.println(Arrays.toString(evenNumber));

//        int[] oddNumber = Arrays.stream(intArr)
//                .filter(n->n%2==1)
//                .toArray();
//        System.out.println(Arrays.toString(oddNumber));
    }
}
