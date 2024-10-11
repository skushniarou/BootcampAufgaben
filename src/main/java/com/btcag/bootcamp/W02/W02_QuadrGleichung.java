package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_QuadrGleichung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Zahl a eingeben: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Bitte Zahl b eingeben: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Bitte Zahl c eingeben: ");
        double c = Double.parseDouble(sc.nextLine());
        System.out.println("Bitte Zahl x eingeben: ");
        double x = Double.parseDouble(sc.nextLine());
        double fx = QuadrGleichung(a,b,c,x);

        System.out.println("f(" + x + ") = " + fx);
    }

    public static double QuadrGleichung(double a, double b, double c, double x) {
        double fx = (double) (a * Math.pow(x, 2) + b * x + c);
        return fx;
    }
}
