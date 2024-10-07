package com.btcag.bootcamp;

public class Test {
    // Globale Variable
    static int globalVariable = 10;

    public static void main(String[] args) {
        System.out.println("Vorher: " + globalVariable);
        anotherFunction();
        System.out.println("Nachher: " + globalVariable);
    }

    // Funktion, die die globale Variable ändert
    public static void changeGlobalVariable() {
        globalVariable = 20;
    }

    // Andere Funktion, die changeGlobalVariable aufruft
    public static void anotherFunction() {
        changeGlobalVariable();
    }
}
