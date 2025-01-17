package com.syed.java.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedVowelsInString {
    public static void main(String[] args) {
        String str = "hello world";

        // Split the string into words
        List<String> words = Arrays.asList(str.split(" "));

        // Count the number of vowels in each word
        Map<String, Long> vowelCounts = words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> countVowels(word)
                ));

        // Find the words with the most repeated vowels
        String mostRepeatedVowelWord = vowelCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        // Print the result
        System.out.println("Most repeated vowel word: " + mostRepeatedVowelWord);
        System.out.println("Vowel count: " + vowelCounts.get(mostRepeatedVowelWord));
    }

    // Helper method to count vowels in a word
    static long countVowels(String word) {
        return word.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
    }
}