package org.dsa.challanges_leetcode.hashTables;

import java.util.*;

public class CommonChars {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        Set<Character> letrasAnalisadas = new HashSet<>();

        String firstWord = words[0];

        for (int i = 0; i < firstWord.length(); i++) {

            char letra = firstWord.charAt(i);

            if (letrasAnalisadas.contains(letra)) {
                continue;
            }

            letrasAnalisadas.add(letra);

            int menorQuantidade = Integer.MAX_VALUE;

            for (String word : words) {
                int quantidade = 0;

                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == letra) {
                        quantidade++;
                    }
                }

                menorQuantidade = Math.min(menorQuantidade, quantidade);
            }

            for (int j = 0; j < menorQuantidade; j++) {
                result.add(String.valueOf(letra));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        CommonChars commonChars = new CommonChars();
        System.out.println(commonChars.commonChars(new String[]{"frio","trancar","cozinhar"}));
    }
}
