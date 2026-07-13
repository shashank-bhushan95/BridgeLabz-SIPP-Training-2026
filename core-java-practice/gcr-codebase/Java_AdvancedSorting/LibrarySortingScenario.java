package Java_AdvancedSorting;

import java.util.Arrays;
import java.util.Random;

public class LibrarySortingScenario {
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

    static int partition(int[] a, int l, int h) {
        int p = a[h], i = l;
        for (int j = l; j < h; j++)
            if (a[j] <= p) {
                int x = a[i];
                a[i] = a[j];
                a[j] = x;
                i++;
            }
        int x = a[i];
        a[i] = a[h];
        a[h] = x;
        return i;
    }

    static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int p = partition(a, l, h);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
        }
    }

    static void countingSort(int[] a) {
        int[] c = new int[21];
        for (int x : a) c[x]++;
        int k = 0;
        for (int i = 1; i <= 20; i++) while (c[i]-- > 0) a[k++] = i;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 7};
        int[] b = a.clone();
        int[] g = {3, 5, 1, 20, 2, 5, 1};
        long s = System.nanoTime();
        mergeSort(a, 0, a.length - 1);
        long e = System.nanoTime();
        System.out.println(Arrays.toString(a));
        System.out.println("Merge:" + (e - s));
        s = System.nanoTime();
        quickSort(b, 0, b.length - 1);
        e = System.nanoTime();
        System.out.println(Arrays.toString(b));
        System.out.println("Quick:" + (e - s));
        countingSort(g);
        System.out.println(Arrays.toString(g));
        for (int n : new int[]{100, 1000, 10000}) {
            int[] x = new int[n];
            Random r = new Random();
            for (int i = 0; i < n; i++) x[i] = r.nextInt(100000);
            long t1 = System.nanoTime();
            mergeSort(x, 0, n - 1);
            System.out.println(n + " -> " + (System.nanoTime() - t1));
        }
    }
}
