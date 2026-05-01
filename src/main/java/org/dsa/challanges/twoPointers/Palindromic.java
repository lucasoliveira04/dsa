package org.dsa.challanges.twoPointers;

public class Palindromic {
    public static void main(String[] args) {
        String isPalindromo = "arara";
        String isNotPalindromo = "lucas";

        if (isPalindromic(isNotPalindromo)) {
            System.out.println("Palindromic is palindromic");
        } else  {
            System.out.println("Palindromic is not palindromic");
        }
    }

    private static boolean isPalindromic(String s) {
       int left = 0;
       int right = s.length() - 1;

       while (left < right) {
           if (s.charAt(left) != s.charAt(right)) {
               return false;
           }

           left++;
           right--;
       }

       return true;
    }
}
