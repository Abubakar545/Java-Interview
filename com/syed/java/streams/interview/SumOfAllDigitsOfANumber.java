package com.syed.java.streams.interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfANumber {
   public static void main(String[] args) {
      int i = 15623;

      Integer collect = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

      System.out.println(collect);
   }
}