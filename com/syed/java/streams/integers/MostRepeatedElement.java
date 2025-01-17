package com.syed.java.streams.integers;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
    public static void main(String[] args) {
        int[] intArr = {1,2,2,3,4,4,4,5,6,7,7,7,7};
//        List<Integer> myList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

        System.out.println(Arrays.stream(intArr).boxed().collect(Collectors.toList()).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());


//        System.out.println(myList);

//        Map<Integer,Long> countElement = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        System.out.println(countElement);

//        int repeatedElement = countElement.entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .get()
//                .getKey();

//        System.out.println("Most repeated element in the array is "+repeatedElement);
    }
}
