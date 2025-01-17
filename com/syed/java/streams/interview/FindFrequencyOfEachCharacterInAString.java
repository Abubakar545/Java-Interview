package com.syed.java.streams.interview;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEachCharacterInAString {
    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

        Map<Character, Long> chars = inputString.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(chars);
//        List<String> list = List.of("Java Concept Of The Day", "Hello");


//        Map<String, Long> collect = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println(collect);

//        Map<Character, Long> frequencyCharacter = inputString.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println(frequencyCharacter);



//        List<Integer> list = List.of(1,1,2,2,3,3,3,4);
//
//        Map<Integer, Long> collect = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        Integer key = collect.entrySet()
//                .stream()
//                .min(Map.Entry.comparingByValue())
//                .get()
//                .getKey();
//        System.out.println(key);



    }
}
