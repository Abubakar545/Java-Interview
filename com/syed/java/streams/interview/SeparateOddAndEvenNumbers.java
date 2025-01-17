package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> oddEvenNumbersMap = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

//        System.out.println(oddEvenNumbersMap);
        Set<Map.Entry<Boolean, List<Integer>>> entires = oddEvenNumbersMap.entrySet();

//        System.out.println(entires);
        for (Map.Entry<Boolean, List<Integer>> entry : entires){
            System.out.println("------------");
            if(entry.getKey()){
                System.out.println("Even Number");
            }else {
                System.out.println("Odd Number");
            }
            System.out.println("-------------");
            List<Integer> value = entry.getValue();
            for (Integer i : value){
                System.out.println(i);
            }

        }




    }
}
