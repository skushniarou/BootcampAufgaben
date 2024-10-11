package com.btcag.bootcamp.W03;

public class W03_ByRef {
    public static void main(String[] args) {

        W03_ByRefClass obj = new W03_ByRefClass(5);

        W03_ByRefClass.doubleValue(obj.value);
        System.out.println("Doubled value: " + obj.value);

    }
}
