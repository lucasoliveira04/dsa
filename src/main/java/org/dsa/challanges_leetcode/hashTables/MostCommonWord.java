package org.dsa.challanges_leetcode.hashTables;

import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));

        String result = "";
        int max = 0;

        for (String word : banned) {
            bannedWords.add(word.toLowerCase());
        }

        StringBuilder word = new StringBuilder();

        for (int i = 0; i <= paragraph.length(); i++) {
            if (i < paragraph.length() && Character.isLetter(paragraph.charAt(i))) {
                word.append(Character.toLowerCase(paragraph.charAt(i)));
            } else {
                if (word.length() > 0) {
                    String palavraAtual = word.toString();

                    if (!bannedWords.contains(palavraAtual)) {
                        map.put(palavraAtual, map.getOrDefault(palavraAtual, 0) + 1);

                        if (map.get(palavraAtual) > max) {
                            max = map.get(palavraAtual);
                            result = palavraAtual;
                        }
                    }

                    word.setLength(0);
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        MostCommonWord mostCommonWord = new MostCommonWord();
        String[] banned = {"bola"};
        System.out.println(mostCommonWord.mostCommonWord("Lucas jogou a bola no gol e foi gol", banned));
    }
}
