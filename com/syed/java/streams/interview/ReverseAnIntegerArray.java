package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAnIntegerArray {
   public static void main(String[] args) {
      int[] array = new int[] {5, 1, 7, 3, 9, 6};

      List<Integer> collect = Arrays.stream(array)
              .boxed()
              .collect(Collectors.toList());

      Collections.reverse(collect);

      System.out.println(collect);


//      int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();

//      System.out.println(Arrays.toString(reversedArray));
   }
}