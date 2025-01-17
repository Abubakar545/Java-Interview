package com.syed.java.streams.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintTheCountOfEachCharacterInAString {
    public static void main(String[] args) {
        String s = "string data to count each character";

        Map<String, Long> collect = Arrays.stream(s.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


    }
}
