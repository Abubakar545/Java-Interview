package com.syed.java.strings;

public class ClassCreator {

    public static String formateString(String input){
        StringBuilder formateString = new StringBuilder();
        boolean capatalizeNext = true;

        for(char ch:input.toCharArray()){
            if(Character.isWhitespace(ch)){
//                formateString.append(ch);
                capatalizeNext = true;
            }else if(capatalizeNext){
                formateString.append(Character.toUpperCase(ch));
                capatalizeNext = false;
            }else{
                formateString.append(Character.toLowerCase(ch));
            }
        }

        return formateString.toString();
    }
    public static void main(String[] args) {
String input ="Palindrome program using Java 8 streams";
        String s = formateString(input);
        System.out.println("public class "+s+" {");
        System.out.println("   public static void main(String[] args) {");
//        System.out.println("        List<> listOfIntegers = Arrays.asList();");
        System.out.println("   }");
        System.out.println("}");
    }
}

