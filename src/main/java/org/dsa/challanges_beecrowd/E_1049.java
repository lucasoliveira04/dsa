package org.dsa.challanges_beecrowd;

import java.util.Scanner;

public class E_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p1,p2,p3, r = "";

        p1 = sc.next();

        switch (p1){
            case "vertebrado":
                p2 = sc.next();
                switch (p2){
                    case "ave":
                        p3 = sc.next();
                        switch (p3){
                            case "carnivoro":
                                r = "aguia";
                                break;
                            case "onivoro":
                                r = "pomba";
                                break;
                        }
                        break;
                    case "mamifero":
                        p3 = sc.next();
                        switch (p3){
                            case "onivoro":
                                r = "homem";
                                break;
                            case "herbivoro":
                                r = "vaca";
                                break;
                        }
                        break;
                }
                break;
            case "invertebrado":
                p2 = sc.next();
                switch (p2){
                    case "inseto":
                        p3 = sc.next();
                        switch (p3){
                            case "hematofago":
                                r = "pulga";
                                break;
                            case "herbivoro":
                                r = "lagarta";
                                break;
                        }
                        break;
                    case "anelideo":
                        p3 = sc.next();
                        switch (p3){
                            case "hematofago":
                                r = "sanguessuga";
                                break;
                            case "onivoro":
                                r = "minhoca";
                                break;
                        }
                        break;
                }
                break;
        }

        System.out.println(r);

    }
}
