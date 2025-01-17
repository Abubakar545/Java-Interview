package com.syed.java.interviewquestion;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,7,7,8,9,9};

        Set<Integer> set = new HashSet<>();


        for(Integer num : arr){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }
}
