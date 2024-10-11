package com.btcag.bootcamp.W02;

public class W02_Sortieren {
    public static void main(String[] args) {
        int[] zahlen = {5,13,6,8,11,15,2};

        int n = zahlen.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (zahlen[j] > zahlen[j + 1]) {

                    int zwischenablage = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = zwischenablage;
                }

                System.out.print("Zwischenergebnis: ");
                for (int zahl : zahlen) {
                    System.out.print(zahl + " ");
                }
                System.out.println();
            }
        }

        System.out.print("Sortiertes Array: ");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }
}
