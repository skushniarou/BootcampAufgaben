package com.btcag.bootcamp.W01;

import java.util.Scanner;

public class W01_Crosssum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Unsere Variablen für Teilaufgaben 1 und 2
        long eing1 = 0;
        String eing2 = "";

        //Abfrage für Eingabe 1
        System.out.println("Bitte Zahl eingeben (Long):");
        eing1 = sc.nextLong();

        //Zwischenablage für Eingabe 1 deklarieren
        long eing1Quer = 0;

        // Quersumme berechnen
        while (eing1 != 0) {
            eing1Quer = eing1Quer + eing1 % 10;
            eing1 /= 10;
        }

        // Ergebnis 1 ausgeben
        System.out.println(eing1Quer);

        //Abfrage für Eingabe 2
        sc.nextLine();
        System.out.println("Bitte Zahl eingeben (String):");
        eing2 = sc.nextLine();

        //Zwischenablage für Eingabe 1 deklarieren
        int eing2Quer = 0;
        String temp = "0";
        // Quersumme berechnen
        int i = 0;
        while (i < eing2.length()) {
            temp += eing2.charAt(i);
            eing2Quer += Integer.parseInt(temp);
            temp = "0";
            i++;
        }

        // Ergebniss 2 ausgeben
        System.out.println(eing2Quer);
    }
}
