package com.syed.java.streams.list;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

        //find unique element from the list
        List<Integer> mylist = Arrays.asList(1,1,1,2,2,4,4,7,7,8,9,9);

        Map<Integer, Long> countedElement = mylist.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countedElement);

        int repeatedElement = countedElement.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(repeatedElement);
        //avg
//        OptionalDouble avg = mylist.stream()
//                .mapToInt(Integer::intValue)
//                .average();
//
//        System.out.println(avg);

        //sum
//        int sum = mylist.stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        System.out.println(sum);

        //min element
//        int min = mylist.stream()
//                .min(Integer::compare)
//                .get();
//
//        System.out.println(min);

        //max
//        int max =mylist.stream()
//                .max(Integer::compare)
//                .get();
//        System.out.println(max);

//        mylist.stream()
//                .reduce((s1,s2)->s2)
//                .ifPresent(System.out::println);
//        Collections.reverse(mylist);
//        mylist.stream()
//                .findFirst()
//                .ifPresent(System.out::println);

//        Set<Integer> uniqueElement = new HashSet<>();
//
//        Set<Integer> duplicateElement = new HashSet<>();
//
//        mylist.forEach(n->{
//            if(!uniqueElement.add(n)){
//                duplicateElement.add(n);
//            }
//        });
//
//        uniqueElement.stream().filter(n->!duplicateElement.contains(n)).forEach(System.out::println);

//        System.out.println(duplicateElement);
//        System.out.println(uniqueElement);
        //Duplicate Element
//        mylist.stream().distinct().forEach(System.out::println);

        //Even number
//        mylist.stream()
//                .filter(n->n%2==0)
//                .forEach(System.out::println);

//        Set<Integer> uniqueElement = new HashSet<>();
//
//        Set<Integer> duplicateElement = new HashSet<>();



//        mylist.forEach( n->{
//            if(!uniqueElement.add(n)){
//                duplicateElement.add(n);
//            }
//        });
//
//        System.out.println("unique Element "+uniqueElement+"\nduplicate element "+duplicateElement);
//
//        uniqueElement.stream()
//                .filter(n-> !duplicateElement.contains(n))
//                .forEach(System.out::println);




//        mylist.stream()
//                .distinct()
//                .forEach(System.out::println);
//        mylist.forEach(n->{
//            if(!uniqueElement.add(n)){
//                duplicateElement.add(n);
//            }
//        });
//
//        uniqueElement.stream()
//                .filter(n -> !duplicateElement.contains(n))
//                .forEach(System.out::println);


//        Set<Integer> nonRepeatedElement = uniqueElement.stream()
//                .filter(n -> !duplicateElement.contains(n))
//                .collect(Collectors.toSet());
//
//        System.out.println(nonRepeatedElement);

//        System.out.println(uniqueElement);
//        System.out.println(duplicateElement);

        //unique elements
//          mylist.stream()
//                  .filter(n -> uniqueElement.add(n))
//                  .collect(Collectors.toSet());
//        System.out.println(uniqueElement);

    }
}
