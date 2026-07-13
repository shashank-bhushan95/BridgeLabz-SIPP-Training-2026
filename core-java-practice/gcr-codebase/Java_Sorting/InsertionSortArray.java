package Java_Sorting;

import java.util.Arrays;

public class InsertionSortArray {
    public static void main(String[] args) {
        int[] a = {12, 11, 13, 5, 6};
        for (int i = 1; i < a.length; i++) {
            int k = a[i], j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;
        }
        System.out.println(Arrays.toString(a));
    }
}