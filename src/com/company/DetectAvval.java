package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DetectAvval {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(10);
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            int random = new Random().nextInt((100 - 1) + 1);
            list.add(random);
//            System.out.println(list.get(i));
        }


        int input;
        do {
            System.out.println("please enter number: ");
            input = scanner.nextInt();
        }
        while (check(input));


    }

    public static boolean check(int a) {

        if (a % 2 == 0) {
            System.out.println("bar 2: " + a / 2);
        } else if (a % 3 == 0) {
            System.out.println("bar 3: " + a / 3);
        } else if (a % 5 == 0) {
            System.out.println("bar 5: " + a / 5);
        } else if (a % 7 == 0) {
            System.out.println("bar 7: " + a / 7);
        } else {
            System.out.println("avval ast");
            return false;
        }
        return true;
    }
}
