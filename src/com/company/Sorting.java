package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Sorting {


    public static void main(String[] args) {

        Integer[] array = new Integer[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + i + " th Number: ");
            int a = scanner.nextInt();
            array[i] = a;
        }


        Arrays.sort(array);
        System.out.println("ascending: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("descending: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

}
