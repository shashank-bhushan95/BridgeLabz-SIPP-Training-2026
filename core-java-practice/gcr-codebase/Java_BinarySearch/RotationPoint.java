package Java_BinarySearch;

public class RotationPoint {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 1, 2, 3, 4};
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] > a[r]) l = m + 1;
            else r = m;
        }
        System.out.println(l);
    }
}