package com.btcag.bootcamp;

import java.util.Random;

public class W03_QueueList implements W03_QueueListInterface{

    private int[] array;

    public W03_QueueList(){
        this.array = new int[5];
    }

    public void fillArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Zufallszahl zwischen 0 und 99
        }
    }

    public void printArray() {
        for (int array : array) {
            System.out.print(array + " ");
        }
        System.out.println();
    }

    private void doubleArraySize (){
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
    }

    @Override
    public int popFront() {
        if (array.length == 0){
            System.out.println("Array ist leer");
            return 0;
        } else {
            int temp = array[0];
            int[] newArray = new int[array.length - 1];
            System.out.println("Erstes Element in Array war: " + temp);
            System.arraycopy(array, 1, newArray, 0, array.length - 1);
            array = newArray;
            return temp;
        }
    }

    @Override
    public int popLast() {
        if (array.length == 0){
            System.out.println("Array ist leer");
            return 0;
        } else {
            int temp = array[array.length - 1];
            int[] newArray = new int[array.length - 1];
            System.out.println("Letztes Element in Array war: " + temp);
            System.arraycopy(array, 0, newArray, 0, array.length - 1);
            array = newArray;
            return temp;
        }
    }


    @Override
    public int pushFront(int i) {
        //ToDo
        int sizeBefore = array.length;
        if (array[array.length-1] != 0){
            doubleArraySize();
        }
        int[] newArray = new int[array.length];
        System.arraycopy(array, 1, newArray, 1, array.length);
        newArray[newArray.length - 1] = i;
        array = newArray;
        return 0;
    }

    @Override
    public int pushLast(int i) {
        //ToDo
        int sizeBefore = array.length;
        if (array[array.length-1] != 0){
            doubleArraySize();
        }
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[sizeBefore] = i;
        array = newArray;
        return 0;
    }

    @Override
    public int get(int index) {
        //ToDo
        return 0;
    }
}
