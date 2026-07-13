package Java_Sorting;

import java.util.Arrays;

public class SelectionSortMovieRatings {
    public static void main(String[] args) {
        int[] a = {8, 5, 9, 7, 6, 10};
        for (int i = 0; i < a.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < a.length; j++) if (a[j] < a[m]) m = j;
            int t = a[i];
            a[i] = a[m];
            a[m] = t;
        }
        System.out.println(Arrays.toString(a));
    }
}