package org.example.algos;

import java.util.List;

public class BinarySearch {
    public static int find(List<Integer> arr, int n) {
        System.out.println("Searching for: " + n);
        int low = 0;
        int high = arr.size() - 1;
        while2 (low <= high) {
            int mid = (high + low) / 2;

            if (arr.get(mid) == n)
                return mid;
            else if (arr.get(mid) < n) {
                low = mid - 1;
            } else{
                high = mid + 1;
            }
        }
        return -1;
    }
}
