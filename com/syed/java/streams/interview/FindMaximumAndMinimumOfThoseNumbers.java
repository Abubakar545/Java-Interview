package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumAndMinimumOfThoseNumbers {
   public static void main(String[] args) {
      List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

      Integer max = listOfIntegers.stream()
              .max(Integer::compare)
              .get();

      Integer min = listOfIntegers.stream()
              .min(Comparator.naturalOrder())
              .get();


      System.out.println("MAX "+max);
      System.out.println("MIN "+min);
   }
}
