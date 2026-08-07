package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        salario = sc.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
        } else {
            if (salario > 2000 && salario <= 3000) {
                imposto = (salario - 2000) * 0.08;
                System.out.printf("R$ %.2f\n", imposto);
            } else if (salario > 3000 && salario <= 4500) {
                double impostoDeMil = 1000 * 0.08;
                double impostoDoExcedente = (salario - 3000) * 0.18;
                imposto = impostoDeMil + impostoDoExcedente;
                System.out.printf("R$ %.2f\n", imposto);
            } else if (salario > 4500) {
                double impostoDeMil = 1000 * 0.08;
                double impostoDeMilEQuinhentos = 1500 * 0.18;
                double impostoDoExcedente = (salario - 4500) * 0.28;
                imposto = impostoDeMil + impostoDeMilEQuinhentos + impostoDoExcedente;
                System.out.printf("R$ %.2f\n", imposto);
            }
        }
    }
}
