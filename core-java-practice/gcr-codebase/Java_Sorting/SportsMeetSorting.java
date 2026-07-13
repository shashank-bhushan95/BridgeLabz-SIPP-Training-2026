package Java_Sorting;

import java.util.Arrays;

public class SportsMeetSorting {
    static void bubble(int[] a) {
        int swaps = 0;
        boolean sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    swaps++;
                    flag = true;
                }
            }
            if (!flag) break;
            sorted &= !flag;
        }
        System.out.println("Bubble Swaps: " + swaps);
        System.out.println("Already Sorted: " + sorted);
    }

    static void insertion(int[] a) {
        int swaps = 0;
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
                swaps++;
            }
            a[j + 1] = key;
        }
        System.out.println("Insertion Moves: " + swaps);
    }

    static void trace() {
        int[] a = {64, 25, 12, 22, 11};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int[] s = {90, 75, 98, 85, 88};
        int[] b = s.clone(), i = s.clone();
        bubble(b);
        insertion(i);
        Arrays.sort(s);
        System.out.println("Top3: " + s[s.length - 1] + " " + s[s.length - 2] + " " + s[s.length - 3]);
        trace();
    }
}