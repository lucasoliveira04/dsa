package org.dsa.patterns;

import java.util.HashMap;
import java.util.Map;

/*
 * Sliding Window - Janela Deslizante
 *
 * Usado para resolver problemas com subarrays ou substrings.
 * A janela se move para a direita, aumentando ou diminuindo
 * conforme a regra do problema.
 */
public class SlidingWindow {
    public static void main(String[] args) {
        int[] numeros = {2, 1, 5, 1, 3, 2};

        System.out.println(maiorSomaSubarray(numeros, 3));
        System.out.println(maiorSubstringSemRepeticao("abcabcbb"));
    }

    /*
     * Exemplo 1: Janela fixa
     * Encontra a maior soma entre todos os subarrays de tamanho k.
     *
     * Exemplo:
     * [2, 1, 5, 1, 3, 2], k = 3
     * Resultado: 9, pois 5 + 1 + 3 = 9
     */
    static int maiorSomaSubarray(int[] numeros, int k) {
        if (numeros == null || k < 0 || k > numeros.length) throw new IllegalArgumentException("valor invalido");

        int somaJanela = 0;

        for (int i = 0; i < k; i++) somaJanela += numeros[i];

        int maiorSoma = somaJanela;

        for (int direita = k; direita < numeros.length; direita++) {
            somaJanela += numeros[direita];
            somaJanela -= numeros[direita - k];

            maiorSoma = Math.max(maiorSoma, somaJanela);
        }
        return maiorSoma;
    }

    /*
     * Exemplo 2: Janela variável
     * Retorna o tamanho da maior substring sem caracteres repetidos.
     *
     * Exemplo:
     * "abcabcbb" -> 3 ("abc")
     */
    static int maiorSubstringSemRepeticao(String texto) {
        Map<Character, Integer> ultimaPosicao = new HashMap<>();

        int esquerda = 0;
        int maiorTamanho = 0;

        for (int direita = 0; direita < texto.length(); direita++) {
            char letraAtual = texto.charAt(direita);

            if (ultimaPosicao.containsKey(letraAtual)
                    && ultimaPosicao.get(letraAtual) >= esquerda) {
                esquerda = ultimaPosicao.get(letraAtual) + 1;
            }

            ultimaPosicao.put(letraAtual, direita);

            maiorTamanho = Math.max(maiorTamanho, direita - esquerda + 1);
        }

        return maiorTamanho;
    }

}
