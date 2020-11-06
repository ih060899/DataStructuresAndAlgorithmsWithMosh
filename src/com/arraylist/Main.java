package com.arraylist;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(5);
        numbers.insert(56);
        numbers.insert(55);
        numbers.insert(65);
        numbers.insert(75);
        numbers.insert(85);
        numbers.insert(95);
        numbers.insert(15);
//        numbers.removeAt(10);
        System.out.println(numbers.indexOf(100));
        numbers.print();

    }
}
