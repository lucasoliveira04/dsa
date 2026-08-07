package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaInicio, diaHoras, minutosInicio, segundosInicio, diaFinal, horasFinal, minutosFinal, segundosFinal;

        sc.next();
        diaInicio = sc.nextInt();
        diaHoras = sc.nextInt();
        sc.next();
        minutosInicio = sc.nextInt();
        sc.next();
        segundosInicio = sc.nextInt();

        sc.next();
        diaFinal = sc.nextInt();
        horasFinal = sc.nextInt();
        sc.next();
        minutosFinal = sc.nextInt();
        sc.next();
        segundosFinal = sc.nextInt();

        int inicoEmSegundos = (diaInicio * 86400) + (diaHoras * 3600) + (minutosInicio * 60) + segundosInicio;
        int finalEmSegundos = (diaFinal * 86400) + (horasFinal * 3600) + (minutosFinal * 60) + segundosFinal;

        int duracaoEmSegundos = finalEmSegundos - inicoEmSegundos;

        int dias = duracaoEmSegundos / 86400;
        duracaoEmSegundos %= 86400;
        int horas = duracaoEmSegundos / 3600;
        duracaoEmSegundos %= 3600;
        int minutos = duracaoEmSegundos / 60;
        int segundos = duracaoEmSegundos % 60;

        System.out.printf("%s dia(s)\n", dias);
        System.out.printf("%d hora(s)\n", horas);
        System.out.printf("%d minuto(s)\n", minutos);
        System.out.printf("%d segundo(s)\n", segundos);
    }
}
