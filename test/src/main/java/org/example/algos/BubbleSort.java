package org.example.algos;

import java.util.List;

public class BubbleSort {
    public static List<Integer> sort(List<Integer> arr) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
        }

        return arr;
    }

    public static void swap(List<Integer> arr, int i, int j) {
        int first = arr.get(i);
        int second = arr.get(j);
        arr.set(j, first);
        arr.set(i, second);
    }
}
