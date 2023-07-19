package org.example.algos;

import java.util.List;
import java.util.Random;

public class Quick {
    private static void sort(List<Integer> arr, int low, int high) {
        if(low >= high)
            return;

        int pivotIdx = new Random().nextInt(high - low)  + low;
        int pivot = arr.get(pivotIdx);
        swap(arr, pivotIdx ,high);
        int lp = low;
        int rp = high;

        while(lp < rp) {
            while(lp < rp && arr.get(lp) <= pivot)
                lp++;

            while(lp < rp && arr.get(rp) >= pivot)
                rp--;

            swap(arr, lp, rp);
        }

        swap(arr, lp, high);
        sort(arr, low, lp - 1);
        sort(arr, lp + 1, high);
    }

    public static void quickSort(List<Integer> arr) {
        sort(arr, 0, arr.size() - 1);
    }
    public static void swap(List<Integer> arr, int i, int j) {
        int first = arr.get(i);
        int second = arr.get(j);
        arr.set(j, first);
        arr.set(i, second);
    }
}
