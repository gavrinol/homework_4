package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Задание 1, 2

        int[] apples = new int[3];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = i + 1;
            System.out.print(apples[i]);
            if (i < apples.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        double[] pineapples = {1.57, 7.654, 9.986};
        for (int i = 0; i < pineapples.length; i++) {
            System.out.print(pineapples[i]);
            if (i < pineapples.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        String[] alphabet = {"a", "b", "c", "d", "e", "f"};
        System.out.print(String.join(", ", alphabet));
        System.out.println();


        //Задание 3

        for (int i = apples.length - 1; i >= 0; i--) {
            System.out.print(apples[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();

        for (int i = pineapples.length - 1; i >= 0; i--) {
            System.out.print(pineapples[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();

        for (int i = alphabet.length - 1; i >= 0; i--) {
            System.out.print(alphabet[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();

        // Задание 4

        for (int i = 0; i < apples.length; i++) {
            if (apples[i] % 2 == 1) {
                apples[i] = i + 2;
            }
            System.out.print(apples[i]);
            if (i < pineapples.length - 1)
                System.out.print(", ");
        }
    }
}