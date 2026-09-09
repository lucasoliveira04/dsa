package org.dsa.challanges_leetcode.twoPointers;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder mesclada = new StringBuilder();

        int reps = Math.max(word1.length(), word2.length());

        for (int i = 0; i < reps; i++) {
            if (i < word1.length()) {
                mesclada.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                mesclada.append(word2.charAt(i));
            }
        }

        return mesclada.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately m = new MergeStringsAlternately();
        System.out.println(m.mergeAlternately("abcd", "abcde"));
    }
}
