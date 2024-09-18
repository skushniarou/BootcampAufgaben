package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_Backward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Unsere Variablen für Teilaufgaben 1 und 2
        String eing1 = "";
        long eing2 = 0;

        //Abfrage für Eingabe 1
        System.out.println("Bitte Zahl eingeben (String):");
        eing1 = sc.nextLine();

        // Rückwärts asugeben
        int i = 0;
        while (i != eing1.length()) {
            System.out.print(eing1.charAt(eing1.length() - 1 - i));
            i++;
        }
        System.out.println();

        //Abfrage für Eingabe 2
        System.out.println("Bitte Zahl eingeben (Long):");
        eing2 = sc.nextLong();

        //Zwischenablage für Eingabe 2 deklarieren
        long eing2Back = 0;

        // Rückwärts asugeben
        while (eing2 > 0) {
            eing2Back = eing2Back * 10 + eing2 % 10;
            eing2 /= 10;
        }

        // Ausgabe Ergebnis 2
        System.out.println(eing2Back);

    }
}
