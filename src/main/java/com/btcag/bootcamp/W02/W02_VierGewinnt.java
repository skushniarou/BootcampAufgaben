package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_VierGewinnt {
    static boolean playerTurn = true;
    static String currPlayer = "";
    static String spieler1;
    static String spieler2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spielername eingeben
        spieler1 = getValidPlayerName(scanner, "Spieler 1");
        spieler2 = getValidPlayerName(scanner, "Spieler 2");

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

        //Spielfeld Aktualisieren
        while (true) {
            updatePlayfield(spielFeld);
            playerTurn(scanner,playerTurn,spielFeld);
            winConditionCheck(spielFeld);
        }


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

    public static String[][] playerTurn (Scanner scanner, boolean playerTurn, String [][] spielFeld) {
        int spalte;
        int i = 0;
        while (true) {
            try {
                System.out.println("In Welche Spalte sollte Disk fallen?");
                spalte = Integer.parseInt(scanner.nextLine());
                while (true) {
                    if ((!spielFeld[i][spalte-1].equals("[ ]") || i == 5) ){
                        break;
                    }
                    i++;
                }
                if (!spielFeld[i][spalte-1].equals("[ ]")) {
                    if (i - 1 < 0){
                        System.out.println("Diese Eingabe ist ungültig, geben Sie bitte neu ein!");
                        System.out.println();
                        break;
                    } else{
                        i--;
                    }
                }
                if (playerTurn == true){
                    spielFeld[i][spalte-1] = "[X]";
                } else {
                    spielFeld[i][spalte-1] = "[O]";
                }
                changePlayerTurn();
                break;
            } catch (Exception e) {
                System.out.println("Unbekanntes Fehler aufgetreten, bitte Programm neu starten");
            }
        }
        return spielFeld;
    }

    public static void changePlayerTurn () {
        playerTurn = !playerTurn;
    }

    public static String winConditionCheck (String [][] spielFeld) {

        if (playerTurn == true) {
            currPlayer = spieler2;
        }   else {
            currPlayer = spieler1;
        }
        int zeilen = spielFeld.length;         // Anzahl der Zeilen im Array
        int spalten = spielFeld[0].length;

        // Horizontal prüfen
        for (int row = 0; row < zeilen; row++) {
            for (int col = 0; col <= spalten - 4; col++) {
                String kaestchen = spielFeld[row][col];
                if (kaestchen != "[ ]"  && kaestchen == spielFeld[row][col + 1] && kaestchen == spielFeld[row][col + 2] && kaestchen == spielFeld[row][col + 3]) {
                    updatePlayfield(spielFeld);
                    System.out.println("Und Gewinner ist... " + currPlayer + "!!!");
                    System.exit(0);
                }
            }
        }

        // Vertikal prüfen
        for (int col = 0; col < spalten; col++) {
            for (int row = 0; row <= zeilen - 4; row++) {
                String kaestchen = spielFeld[row][col];
                if (kaestchen != "[ ]" && kaestchen == spielFeld[row + 1][col] && kaestchen == spielFeld[row + 2][col] && kaestchen == spielFeld[row + 3][col]) {
                    updatePlayfield(spielFeld);
                    System.out.println("Und Gewinner ist... " + currPlayer + "!!!");
                    System.exit(0);
                }
            }
        }

        // Diagonal (links oben nach rechts unten) prüfen
        for (int row = 0; row <= zeilen - 4; row++) {
            for (int col = 0; col <= spalten - 4; col++) {
                String kaestchen = spielFeld[row][col];
                if (kaestchen != "[ ]" && kaestchen == spielFeld[row + 1][col + 1] && kaestchen == spielFeld[row + 2][col + 2] && kaestchen == spielFeld[row + 3][col + 3]) {
                    updatePlayfield(spielFeld);
                    System.out.println("Und Gewinner ist... " + currPlayer + "!!!");
                    System.exit(0);
                }
            }
        }

        // Diagonal (rechts oben nach links unten) prüfen
        for (int row = 0; row <= zeilen - 4; row++) {
            for (int col = 3; col < spalten; col++) {
                String kaestchen = spielFeld[row][col];
                if (kaestchen != "[ ]" && kaestchen == spielFeld[row + 1][col - 1] && kaestchen == spielFeld[row + 2][col - 2] && kaestchen == spielFeld[row + 3][col - 3]) {
                    updatePlayfield(spielFeld);
                    System.out.println("Und Gewinner ist... " + currPlayer + "!!!");
                    System.exit(0);
                }
            }
        }

        // Falls kein Gewinner gefunden wurde
        return "Kein Gewinner noch...";
    }
}