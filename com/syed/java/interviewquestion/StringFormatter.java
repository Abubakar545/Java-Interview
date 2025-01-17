package com.syed.java.interviewquestion;

public class StringFormatter {
    public static String formatString(String input) {
       StringBuilder formattedString = new StringBuilder();

        boolean captialize = true;
       for(char ch:input.toCharArray()){
           if(Character.isWhitespace(ch)){
               formattedString.append(ch);
               captialize = true;
           } else if (captialize) {
               formattedString.append(Character.toUpperCase(ch));
               captialize = false;
           } else{
               formattedString.append(Character.toLowerCase(ch));
           }
       }

       return formattedString.toString();
    }

    public static void main(String[] args) {


        System.out.println( formatString("HEllo wOrld! WELcome."));

//        String inputString = "HEllo wOrld! WELcome.";
//        String formattedString = formatString(inputString);
//        System.out.println(formattedString); // Output: Hello World! Welcome.
    }
}