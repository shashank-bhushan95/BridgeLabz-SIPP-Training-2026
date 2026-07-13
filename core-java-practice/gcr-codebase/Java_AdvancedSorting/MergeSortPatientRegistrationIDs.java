package Java_AdvancedSorting;

import java.util.Arrays;

public class MergeSortPatientRegistrationIDs {
    static void mergeSort(int[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) t[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        while (i <= m) t[k++] = a[i++];
        while (j <= r) t[k++] = a[j++];
        for (i = 0; i < t.length; i++) a[l + i] = t[i];
    }

    public static void main(String[] args) {
        int[] a = {105, 101, 108, 102, 104};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
