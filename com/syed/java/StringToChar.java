package com.syed.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToChar {

    public static long getCharCount(String str, char c, char c1){
        return str.chars().filter(e -> (char)e == c || (char)e == c1).count();

    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange");

        List<String> longWords = words.stream().filter(e-> e.length()>5).collect(Collectors.toList());

        System.out.println(longWords);
        String str = "Syed Abubakar siddiq";

        System.out.println( getCharCount(str, 'a', 'b'));

//       long count = str.chars().filter(e -> (char)e == 'a' || (char)e == 'b').count();
//        System.out.println(count);




//        char[] char1 = new char[name.length()];
//        for(int i=0; i < name.length(); i++){
//            System.out.println(name.charAt(i));
//            char1[i] = name.charAt(i);
//            System.out.println(char1[i]);
//        }
//        System.out.println(Arrays.toString(char1));
//        System.out.println(char1);
    }
}
