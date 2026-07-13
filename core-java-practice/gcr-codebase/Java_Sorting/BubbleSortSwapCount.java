package Java_Sorting;

public class BubbleSortSwapCount {
    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1};
        int c = 0;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    c++;
                }
        System.out.println(c);
    }
}