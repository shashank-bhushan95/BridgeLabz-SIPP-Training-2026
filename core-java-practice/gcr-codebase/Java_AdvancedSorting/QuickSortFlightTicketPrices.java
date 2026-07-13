package Java_AdvancedSorting;

import java.util.Arrays;

public class QuickSortFlightTicketPrices {
    static int partition(int[] a, int l, int h) {
        int p = a[h], i = l;
        for (int j = l; j < h; j++)
            if (a[j] <= p) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
            }
        int t = a[i];
        a[i] = a[h];
        a[h] = t;
        return i;
    }

    static void quick(int[] a, int l, int h) {
        if (l < h) {
            int p = partition(a, l, h);
            quick(a, l, p - 1);
            quick(a, p + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] a = {4500, 2200, 3800, 1800, 5200};
        quick(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
