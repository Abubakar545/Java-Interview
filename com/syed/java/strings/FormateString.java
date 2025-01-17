package com.syed.java.strings;

public class FormateString {
    public static String formatString(String name){
        StringBuilder stringFormatter = new StringBuilder();

        boolean captalize = true;

        for(char ch : name.toCharArray()){
            if(Character.isWhitespace(ch)){
                stringFormatter.append(ch);
                captalize = true;
            }else if(captalize){
                stringFormatter.append(Character.toUpperCase(ch));
                captalize = false;
            }else{
                stringFormatter.append((Character.toLowerCase(ch)));
            }
        }


        return stringFormatter.toString();
    }
    public static void main(String[] args) {

        String inputString = "HEllo wOrld! WELcome.";
        String formattedString = formatString(inputString);
        System.out.println(formattedString); // Output: Hello World! Welcome.
    }

}
