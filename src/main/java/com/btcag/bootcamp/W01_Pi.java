package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_Pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Benötigte Variablen deklarieren
        int eing1 = 0;
        int i = 0;
        double Pi = 0.0;

        //Anzahl von Iterationen abfragen
        System.out.println("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen?:");
        eing1 = sc.nextInt();
        sc.nextLine();

        //Leibniz-Reihe berechnen
        while (i < eing1) {
            if (i % 2 == 0){
                Pi += 1.0 / (2 * i + 1);
            } else {
                Pi -= 1.0 / (2 * i + 1);
            }
        i++;
        }

        Pi *= 4;

        // Ergebnis ausgeben
        System.out.println(Pi);
    }
}
