package com.btcag.bootcamp;

import java.util.Scanner;

public class W02_VierGewinnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spielername eingeben
        String spieler1 = getValidPlayerName(scanner, "Spieler 1");
        String spieler2 = getValidPlayerName(scanner, "Spieler 2");

        // Ausgabe von Namen
        System.out.println("Registrierte Spieler:");
        System.out.println("Spieler 1: " + spieler1);
        System.out.println("Spieler 2: " + spieler2);

        //Spielfeld generieren
        String [][] spielFeld = new String [6][7];
        for (int i = 0; i < spielFeld.length; i++) {
            for (int j = 0; j < spielFeld[i].length; j++) {
                spielFeld[i][j] = "[ ]";
            }
        }

        //Spielfeld Ausgeben
        updatePlayfield(spielFeld);
    }

    private static String getValidPlayerName(Scanner scanner, String spieler) {
        // return Variable
        String name;

        //Prüfung von Name
        while (true) {
            System.out.print("Bitte geben Sie den Namen von " + spieler + " ein (3-15 Zeichen): ");
            name = scanner.nextLine();
            if (name.length() >= 3 && name.length() <= 15) {
                break;
            } else {
                System.out.println("Ungültiger Name. Der Name muss zwischen 3 und 15 Zeichen lang sein.");
            }
        }
        return name;
    }

    public static void updatePlayfield (String [][] spielFeld) {
        for (int i = 0; i < spielFeld.length; i++) {
            for (int j = 0; j < spielFeld[i].length; j++) {
                System.out.print(spielFeld[i][j] + " ");
            }
            System.out.println();
        }
    }

}
