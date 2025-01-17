package com.syed.java.streams.strings;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeated {
    public static void main(String[] args) {
        String input = "Java Articles are Awesome";

        Set<Character> firstRepeated = new HashSet<>();
       Character cha = input.chars()
                .mapToObj(c -> (char) c)
                .filter(ch-> !firstRepeated.add(ch))
                .findFirst()
                        .orElse(null);

        System.out.println(cha);

    }
}
