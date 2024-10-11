package com.btcag.bootcamp;

import java.util.Scanner;

public class W03_QueueListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        W03_QueueList list = new W03_QueueList();

        System.out.println("Eine Array-Liste würde erstellt.");
        list.fillArray();
        list.printArray();
        System.out.println();
        System.out.println("Folgende Befehle stehe dir zur verfügung:");
        System.out.println("1 - Gibt das erste Element zurück und löscht diesem von den Daten");
        System.out.println("2 - Gibt das letzte Object zurück und entfernt dieses von den Daten");
        System.out.println("3 - Fügt dein Object den Daten am Anfang hinzu");
        System.out.println("4 - Fügt dein Object den Daten am Ende hinzu");
        System.out.println("5 - Objekt auf bestimmte Stelle auswählen");

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    list.popFront();
                    break;
                case "2":
                    list.popLast();
                    break;
                case "3":
                    System.out.print("Geben Sie eine Zahl ein: ");
                    list.pushFront(Integer.parseInt(sc.nextLine()));
                    break;
                case "4":
                    System.out.print("Geben Sie eine Zahl ein: ");
                    list.pushLast(Integer.parseInt(sc.nextLine()));
                    break;
                case "5":
                    System.out.print("Geben Sie eine Zahl ein: ");
                    list.get(Integer.parseInt(sc.nextLine()));
            }
            list.printArray();
        }
    }
}
