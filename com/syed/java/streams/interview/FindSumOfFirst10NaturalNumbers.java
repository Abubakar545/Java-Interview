package com.syed.java.streams.interview;

import java.util.stream.IntStream;

public class FindSumOfFirst10NaturalNumbers {
   public static void main(String[] args) {

      int sum = IntStream.range(1, 11).sum();

      System.out.println(sum);
   }
}