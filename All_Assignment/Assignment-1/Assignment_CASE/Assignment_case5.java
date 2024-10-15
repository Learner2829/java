// Problem 5: Palindrome Checker
// Develop a program that checks whether a given string is a palindrome. The program should have the
// following features:
//  Prompt the user to enter a string.
//  Implement a method to determine if the string is a palindrome (a word, phrase, number, or
// other sequence of characters that reads the same backward as forward).
//  Display the result (whether the input is a palindrome or not) to the user.

import java.util.Scanner;
class palindromeChecker{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a word, phrase, number, or other sequence of characters:");
        String input = obj.nextLine();

        boolean result = isPalindrome(input);

        if(result){
            System.out.println("The input is a palindrome");
        }else{
            System.out.println("The input is not a palindrome");
        }

    }

    public static boolean isPalindrome(String str){
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";

        for(int i=cleanedStr.length()-1; i>=0; i--){
            reversed = reversed + cleanedStr.charAt(i);
        }

        if(cleanedStr.equals(reversed)){
            return true;
        }else{
            return false;
        }
    }
}