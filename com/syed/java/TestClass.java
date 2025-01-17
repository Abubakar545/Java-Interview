package com.syed.java;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//RuntimeException
//Exception
//RuntimeException
//Comparator
public class TestClass {

    public static void main(String[] args) {


        int intArr[] = {1,1,2,2,3,3,4,3};

        List<Integer> myList = Arrays.stream(intArr)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(myList);

        Map<Integer, Long> collect = myList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


        Integer key = collect.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(key);

//        List<Integer> collect = Arrays.stream(intArr)
//                .boxed()
//                .collect(Collectors.toList());
//
//        Set<Integer> uniqueElement = new HashSet<>();
//        Set<Integer> duplicateElement = new HashSet<>();
//
//        collect.forEach(n->{
//            if(!uniqueElement.add(n)){
//                duplicateElement.add(n);
//            }
//        });

//        Set<Integer> collect1 = uniqueElement.stream()
//                .filter(n -> !duplicateElement.contains(n))
//                .collect(Collectors.toSet());
//
//        System.out.println(collect1);
//
//        System.out.println(uniqueElement);
//        System.out.println(duplicateElement);

//        System.out.println(collect);




//        Arrays.stream(intArr)
//                .forEach(i -> System.out.printf("%d | %d\n",i,i*i));

//        Arrays.stream(intArr)
//                .map(i -> i*i)
//                .forEach(System.out::println);
//        int[] arr={2,3,1,4,1,4,333,3,333,2,2,2,5,2,22};
//
//        int[] arr1 = new int[arr.length];
//        Set<Integer> set = new HashSet<>();
//
//        for(Integer num:arr){
//            if(!set.add(num)){
//                System.out.println(num);
//
//
//                if(set.contains(num));
////                Iterator it = set.iterator();
////                while (it.hasNext()){
////                    System.out.println(it);
////                }
//            }
//        }


//        Arrays.stream(arr).sorted().filter( e -> e ).collect(Coll)
//        int[] arr1 = new int[arr.length];
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i].)
//
//        }

//        System.out.println(arr1.toString());

//        if(int[] num : arr){
//
//        }


    }
}
