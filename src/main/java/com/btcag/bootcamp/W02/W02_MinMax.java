package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl 1 eingeben: ");
        int z1 = Integer.parseInt(sc.nextLine());
        System.out.print("Zahl 2 eingeben: ");
        int z2 = Integer.parseInt(sc.nextLine());

        int minValue =  minValue(z1, z2);
        int maxValue = maxValue(z1, z2);

        System.out.println("Min: " + minValue + " Max: " + maxValue);
    }

    public static int minValue (int val1, int val2){
        return Math.min(val1, val2);
    }

    public static int maxValue (int val1, int val2){
        return Math.max(val1, val2);
    }
}
