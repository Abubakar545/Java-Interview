package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetThreeMaximumNumbersAndThreeMinimumNumbers {
   public static void main(String[] args) {
      List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

      // get min numbers
      System.out.println("Min number ");
      listOfIntegers.stream()
              .sorted()
              .limit(4)
              .skip(1)
              .forEach(System.out::println);

      // get max numbers
      System.out.println("Max number ");
      listOfIntegers.stream()
              .sorted(Collections.reverseOrder())
              .limit(3)
              .forEach(System.out::println);

   }
}