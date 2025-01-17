package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumberInAnIntegerArray {
   public static void main(String[] args) {
      List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);


       listOfIntegers.stream()
                      .sorted(Comparator.reverseOrder())
               .skip(1)
               .limit(1)
                              .forEach(System.out::println);

//      System.out.println(i);
//      Integer i = listOfIntegers.stream()
//              .sorted(Collections.reverseOrder())
//              .skip(1)
//              .findFirst().get();
//      System.out.println(i);
//              .forEach(System.out::println);

   }
}