package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDetectAvval {


    public static void main(String[] args) {


        Random rand = new Random();


        for (int i = 0; i < 10; i++) {

            int value = rand.nextInt(1000);
            avval(value);

        }


    }


    public static void avval(int a) {

        if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
            System.out.println("random: " + a);
        } else {
            System.out.println("random: " + a + " is avval");
        }


    }


}
