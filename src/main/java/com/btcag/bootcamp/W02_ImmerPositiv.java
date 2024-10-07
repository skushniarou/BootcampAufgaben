package com.btcag.bootcamp;

import java.util.Scanner;

public class W02_ImmerPositiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Zahl ein: ");
        int x = Integer.parseInt(sc.nextLine());

        if (x < 0) {
            x = x * -1;
        }
        System.out.println("Unsere Zahl " + x + " ist positiv :)");
    }
}
