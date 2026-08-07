package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, totalDeCobaias = 0, totalC = 0, totalR = 0, totalS = 0;
        double porcentagemC, porcentagemR, porcentagemS;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int quantidade = sc.nextInt();
            char tipo = sc.next().charAt(0);

            if (tipo >= 1 && quantidade <= 15){
                switch (tipo) {
                    case 'C':
                        totalC += quantidade;
                        break;
                    case 'R':
                        totalR += quantidade;
                        break;
                    case 'S':
                        totalS += quantidade;
                        break;
                }
                totalDeCobaias+=quantidade;
            }
        }

        porcentagemC = ((double) totalC / totalDeCobaias) * 100;
        porcentagemR = ((double) totalR / totalDeCobaias) * 100;
        porcentagemS = ((double) totalS / totalDeCobaias) * 100;

        System.out.printf("Total: %d cobaias\n", totalDeCobaias);
        System.out.printf("Total de coelhos: %d\n", totalC);
        System.out.printf("Total de ratos: %d\n", totalR);
        System.out.printf("Total de sapos: %d\n", totalS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", porcentagemC);
        System.out.printf("Percentual de ratos: %.2f %%\n", porcentagemR);
        System.out.printf("Percentual de sapos: %.2f %%\n", porcentagemS);

    }
}
