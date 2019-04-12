package com.company;

import java.util.Random;

public class Factorial {

    static long sum = 0;

    public static void main(String[] args) {


        while (sum < 10000) {
            task();
        }

    }


    public static long fact(long n) {
        long fact = 1;
        for (int count = 1; count <= n; count++) {
            fact *= count;
        }
        return fact;
    }


    public static void task() {
        Random rand = new Random();
        long a = rand.nextInt(10);
        long b = rand.nextInt(10);


        sum = fact(a) + fact(b);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("sum: " + sum);

        if (sum < 10000) {
            System.out.println("dar mahdode ast.");
        } else {
            System.out.println("dar mahdode nis.");
            System.out.println("The End...");
            return;
        }
        System.out.println("***********************************");
    }


}
