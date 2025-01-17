package com.syed.java.streams.list;

import java.util.Arrays;
import java.util.List;

public class DistinctElement {
    public static void main(String[] args) {
        //find unique element from the list
        List<Integer> mylist = Arrays.asList(1,1,2,2,4,4,7,7,8,9,9);


        //Unique Element
        mylist.stream().distinct().forEach(System.out::println);
    }
}
