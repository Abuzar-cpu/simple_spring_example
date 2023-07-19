package org.example.algos;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void sort(List<Integer> arr) {
        int len = arr.size();
        if(len < 2)
            return;

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        int mid = len / 2;

        for(int i = 0; i < mid; i++) {
            first.add(arr.get(i));
        }

        for(int i = mid; i < len; i++) {
            second.add(arr.get(i));
        }

        sort(first);
        sort(second);

        merge(arr, first, second);
    }

    public static void merge(List<Integer> arr, List<Integer> left, List<Integer> right) {
        int l = 0;
        int r = 0;
        int m = 0;

        while(l < left.size() && r < right.size()) {
            if(left.get(l) <= right.get(r)) {
                arr.set(m, left.get(l));
                l++;
            } else {
                arr.set(m, right.get(r));
                r++;
            }
            m++;
        }

        while(l < left.size()) {
            arr.set(m, left.get(l));
            l++;
            m++;
        }
        while(r < right.size()) {
            arr.set(m, right.get(r));
            r++;
            m++;
        }
    }
}
