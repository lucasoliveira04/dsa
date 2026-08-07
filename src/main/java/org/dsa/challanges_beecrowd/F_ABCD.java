package org.dsa.challanges_beecrowd;

import java.util.Random;
import java.util.Scanner;

/*
    Problema: Desafio Musical - F_ABCD

    Você está participando de um jogo de adivinhação musical! O jogo consiste em adivinhar a ordem correta de uma lista de músicas numeradas de 1 a N.
    O computador embaralha as músicas e você deve tentar adivinhá-las na ordem correta.
    O jogador deve fornecer um número correspondente à música que acredita estar na posição correta.
    A cada tentativa, o jogo irá informar se a adivinhação está correta ou incorreta.
    Se o jogador errar três vezes seguidas, o jogo fornecerá uma dica sobre a posição da música correta, indicando um intervalo de números que inclui a resposta correta.

    Entrada:
    A primeira linha contém um inteiro N (1 ≤ N ≤ 100), que representa o número total de músicas.
    As N linhas seguintes contêm números inteiros de 1 a N, representando as músicas embaralhadas (mas você não verá esses números, apenas adivinhará).

    Saida:
    Para cada tentativa, o programa deve imprimir:
    "Música X correta!" se a adivinhação estiver certa.
    "Música X incorreta!" se a adivinhação estiver errada.
    "Dica: A música está entre Y e Z" se o jogador errar três vezes seguidas, onde Y e Z são os limites do intervalo em que a música correta se encontra.
    Ao final do jogo, o programa deve imprimir a taxa de acertos do jogador com duas casas decimais e a lista completa das músicas na ordem embaralhada.


    Exemplo de Entrada:
            5
            3
            1
            2
            4
            5

    Exemplo de Saída:
        Música 1 correta!
        Música 2 incorreta!
        Música 2 incorreta!
        Música 2 incorreta!
        Dica: A música está entre 1 e 3
        Música 2 correta!
        Música 3 correta!
        Música 4 correta!
        Música 5 correta!
        Parabéns, você acertou todas as músicas! Taxa de acertos: 62.50%
        Música 1: 3
        Música 2: 1
        Música 3: 2
        Música 4: 4
        Música 5: 5

*/


public class F_ABCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int musicCertas = 0, music, erros = 0, tentativas = 0;
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            int j = random.nextInt(n);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        do {
            music = sc.nextInt();
            tentativas++;

            if (music == array[musicCertas]) {
                System.out.println("Música " + (musicCertas + 1) + " correta!");
                musicCertas++;
                erros = 0;
            } else {
                System.out.println("Música " + (musicCertas + 1) + " incorreta!");
                erros++;

                if (erros == 3) {
                    int inicio = array[musicCertas] - 1;
                    int fim = array[musicCertas] + 1;

                    if (inicio > fim){
                        int temp = inicio;
                        inicio = fim;
                        fim = temp;
                    }

                    System.out.println("Dica: A música está entre " + inicio + " e " + fim);
                    erros = 0;
                }
            }
        } while (musicCertas != n);

        double taxaAcertos = (double) musicCertas / tentativas * 100;

        System.out.printf("Parabéns, você acertou todas as músicas! Taxa de acertos: %.2f%%\n", taxaAcertos);

        for (int i = 0; i < n; i++) {
            System.out.println("Música " + (i + 1) + ": " + array[i]);
        }
    }
}
