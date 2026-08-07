package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, minutoInical, horaFinal, minutoFinal;

        horaInicial = sc.nextInt();
        minutoInical = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        int inicioTotalM = horaInicial * 60 + minutoInical;
        int fimTotalM = horaFinal * 60 + minutoFinal;

        int duracaoTotalM;

        if (fimTotalM > inicioTotalM) {
            duracaoTotalM = fimTotalM - inicioTotalM;
        } else {
            duracaoTotalM = (24 * 60 - inicioTotalM) + fimTotalM;
        }

        int duracaoHoras = duracaoTotalM / 60;
        int duracaoMinutos = duracaoTotalM % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);
    }
}
