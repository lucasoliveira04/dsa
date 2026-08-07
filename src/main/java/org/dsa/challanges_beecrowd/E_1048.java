package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, newSalary = 0, gainsOnIncrease = 0;
        int increasePorc = 0;

        salario = sc.nextDouble();

        if (salario >= 0 && salario <= 400) {
            newSalary = (salario * 0.15) + salario;
            gainsOnIncrease = newSalary - salario;
            increasePorc = 15;
        } else if (salario >= 400.01 && salario <= 800) {
            newSalary = (salario * 0.12) + salario;
            gainsOnIncrease = newSalary - salario;
            increasePorc = 12;
        } else if (salario >= 800.01 && salario <= 1200) {
            newSalary = (salario * 0.10) + salario;
            gainsOnIncrease = newSalary - salario;
            increasePorc = 10;
        } else if (salario >= 1200.01 && salario <= 2000) {
            newSalary = (salario * 0.07) + salario;
            gainsOnIncrease = newSalary - salario;
            increasePorc = 7;
        } else {
            newSalary = (salario * 0.04) + salario;
            gainsOnIncrease = newSalary - salario;
            increasePorc = 4;
        }

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", gainsOnIncrease);
        System.out.printf("Em percentual: %d %%\n", increasePorc);
    }
}
