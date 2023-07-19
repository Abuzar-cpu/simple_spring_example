package org.example.algos;

import java.util.List;

public class SelectionSort {
    public static void sort(List<Integer> arr) {
        for(int i = 0; i < arr.size() - 1; i++) {
            int min = arr.get(i);
            int minIdx = i;

            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) < min) {
                    min = arr.get(j);
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }

    public static void swap(List<Integer> arr, int i, int j) {
        int first = arr.get(i);
        int second = arr.get(j);
        arr.set(j, first);
        arr.set(i, second);
    }
}
