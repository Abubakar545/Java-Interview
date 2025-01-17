package com.syed.java.streams.interview;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.syed.java.streams.interview.RepeatedVowelsInString.countVowels;

public class ReverseEachWordOfAString {
   public static void main(String[] args) {
      String str = "Java Concept Of The Day";



//      System.out.println(myList);

//      String collect = Arrays.stream(str.split(" "))
//              .map(word -> new StringBuilder(word).reverse())
//              .collect(Collectors.joining(" "));

      List<String> myList = List.of(str.split(""));
      Map<String, Long> collect = myList.stream()
              .collect(Collectors.toMap(
                      word -> word,
                      word -> countVowels(word)
              ));

      System.out.println(collect);
   }
}