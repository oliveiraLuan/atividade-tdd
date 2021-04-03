package com.example.palindrome.utils;

public class PalindromeChecker {
    public static Boolean isPalindrome(String text){
        try{
            StringBuilder sb = new StringBuilder(text.replaceAll("[.!?’',\\\\ ]", ""));
            String textWithoutSpaces = sb.toString();
            String reversedText = sb.reverse().toString();

            if(textWithoutSpaces.equalsIgnoreCase(reversedText))return true;

        } catch (NullPointerException e){
            throw new NullPointerException("O texto não pode ser nulo");
        }
        return false;
    }
}
