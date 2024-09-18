package com.btcag.bootcamp;

public class W01_ArtihOp {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 10;

        //Fall 1
        int ergb1 = var1++;
        System.out.println(var1 + " " + ergb1);

        //Fall 2
        int ergb2 = ++var2;
        System.out.println(var2 + " " + ergb2);
        // Unterschied, dass bei Fall 1 wird zuerst Wert zugewiesen und danach um 1 erhöht
        // Bei Fall zuerst Addition und danach Zuweisung
    }
}
