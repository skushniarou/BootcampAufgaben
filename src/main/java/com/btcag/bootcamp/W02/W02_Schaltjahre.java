package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_Schaltjahre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Jahr ein: ");
        int jahr = sc.nextInt();

        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    schaltjahr(jahr);
                }
                keinSchaltjahr(jahr);
            }
            schaltjahr(jahr);
        } else {
            keinSchaltjahr(jahr);
        }
    }

    public static void schaltjahr(int jahr) {
        System.out.println(jahr + " ist ein Schaltjahr");
    }

    public static void keinSchaltjahr(int jahr) {
        System.out.println(jahr + " ist kein Schaltjahr");
    }
}
