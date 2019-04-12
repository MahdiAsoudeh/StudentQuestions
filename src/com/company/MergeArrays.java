package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrays {


    public static ArrayList<String> list5 = null;

    public static void main(String[] args) {

        List<String> list8 = new ArrayList<String>(8);
        List<String> list5 = new ArrayList<String>(5);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("please add to list8: ");
            String input = scanner.next();
            list8.add(input);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("please add to list5: ");
            String input = scanner.next();
            list5.add(input);
        }


        Collections.sort(list8);
        Collections.sort(list5);


        List<String> newList = Stream.concat(list8.stream(),
                list5.stream()).collect(Collectors.toList());

        Collections.sort(newList);

        newList.forEach(item -> System.out.println(item));


    }
}
