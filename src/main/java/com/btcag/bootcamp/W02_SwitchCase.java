package com.btcag.bootcamp;

import java.util.Scanner;

public class W02_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber = Integer.parseInt(sc.nextLine());
        String dayName = "";

        switch (dayNumber) {
            case 1:
                dayName = "Montag";
                break;
            case 2:
                dayName = "Dienstag";
                break;
            case 3:
                dayName = "Mittwoch";
                break;
            case 4:
                dayName = "Dönnerstag";
                break;
            case 5:
                dayName = "Freitag";
                break;
            case 6:
                dayName = "Samstag";
                break;
            case 7:
                dayName = "Sonstag";
                break;
            default:
                dayName = "Fehler";
                break;
        }
        System.out.println("#"+ dayNumber + " Tag ist der " +dayName);
    }
}