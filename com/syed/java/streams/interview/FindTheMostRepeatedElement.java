package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheMostRepeatedElement {
   public static void main(String[] args) {
      List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

      Map<String, Long> collect = listOfStrings.stream()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      String key = collect.entrySet().stream()
              .max(Map.Entry.comparingByValue())
              .get()
              .getKey();

      System.out.println(key);


   }
}