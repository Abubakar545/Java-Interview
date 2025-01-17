package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheGivenListOfDecimalsInReverseOrder {
   public static void main(String[] args) {
      List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

//      Collections.reverse(decimalList);
      List<Double> collect = decimalList.stream()
              .sorted(Collections.reverseOrder()).collect(Collectors.toList());

      System.out.println(collect);
   }
}
