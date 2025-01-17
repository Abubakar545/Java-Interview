package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;

public class FindSumAndAverageOfAllElements {
   public static void main(String[] args) {
      int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

      int sum = Arrays.stream(a)
              .sum();

      double avg = Arrays.stream(a)
              .average()
              .getAsDouble();

      System.out.println(sum);
      System.out.println(avg);
   }
}