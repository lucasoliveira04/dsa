package org.dsa.challanges.twoPointers;

public class Palindromic {
    public static void main(String[] args) {
        String isPalindromo = "arara";
        String isNotPalindromo = "lucas";
        String special = "A man, a plan, a canal: Panama";

        if (isPalindromic(special)) {
            System.out.println("Palindromic is palindromic");
        } else  {
            System.out.println("Palindromic is not palindromic");
        }
    }

    private static boolean isPalindromic(String s) {
       int left = 0;
       int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))  left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        
        return true;
    }
}
