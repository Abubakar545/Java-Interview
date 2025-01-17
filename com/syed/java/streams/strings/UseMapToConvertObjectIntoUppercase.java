package com.syed.java.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseMapToConvertObjectIntoUppercase {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("aa","bb","cc");

        List<String> collect = nameList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
