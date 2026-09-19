package org.dsa.challanges_leetcode.Strings;

public class ReverseString3 {

    private static String reverseString(String str) {
        String[] palavras = str.split(" ");

        for (int i = 0; i < palavras.length; i++) {

            char[] letras = palavras[i].toCharArray();

            int esquerda = 0;
            int direita = letras.length - 1;

            while (esquerda < direita) {
                char temp = letras[esquerda];
                letras[esquerda] = letras[direita];
                letras[direita] = temp;

                esquerda++;
                direita--;
            }

            palavras[i] = new String(letras);
        }

        return String.join(" ", palavras);
    }


    public static void main(String[] args) {
        System.out.println(reverseString("Lucas Oliveira Campos"));
    }
}
