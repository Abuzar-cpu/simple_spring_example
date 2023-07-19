package org.example.algos;

import java.util.List;

public class InsertionSort {
    public static void sort(List<Integer> arr) {
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int j = i - 1;

            while(j >= 0 && arr.get(j) > curr) {
                arr.set(j + 1, arr.get(j));
                j--;
            }

            arr.set(j + 1, curr);
        }
    }

}
