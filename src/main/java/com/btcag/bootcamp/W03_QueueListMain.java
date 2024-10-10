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

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    list.popFront();
                    break;
                case "2":
                    list.popLast();
                    break;
            }
            list.printArray();
        }
    }
}
