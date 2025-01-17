package com.syed.java.interviewquestion;

import java.util.Collections;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
//        Integer[] salaries = {100000, 50000, 75000, 120000, 80000};

        // find highest salary
        List<Integer> salary = List.of(100000, 50000, 75000, 120000, 80000);

        int i = salary.stream()
                .sorted(Collections.reverseOrder())
//                .skip(2)
              .findFirst()
                        .orElse(null);

        System.out.println(i);
    }
}
