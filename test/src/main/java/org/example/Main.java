package org.example;

import org.example.algos.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < 10; i++)
            myArr.add(r.nextInt(100));

        System.out.println("Original: " + myArr);
        int searchFor = myArr.get(5);
        Quick.quickSort(myArr);
        System.out.println(BinarySearch.find(myArr, searchFor));
//        System.out.println(BinarySearch.find(myArr, myArr.get(5)));


        System.out.println(myArr);
    }
}