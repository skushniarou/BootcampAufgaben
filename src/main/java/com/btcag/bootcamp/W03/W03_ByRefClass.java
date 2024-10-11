package com.btcag.bootcamp.W03;

public class W03_ByRefClass {
    static int value;

    W03_ByRefClass(int userValue) {
        value = userValue;
    }

    public static void doubleValue (int userValue) {
        value = userValue * 2;
    }
}
