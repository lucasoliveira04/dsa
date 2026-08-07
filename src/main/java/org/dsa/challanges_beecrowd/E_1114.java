package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int passwordValid = 2002;
        int password;

        do{
            password = sc.nextInt();

            if (passwordValid == password){
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        } while (true);
    }
}
