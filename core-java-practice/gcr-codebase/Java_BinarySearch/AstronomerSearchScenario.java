package Java_BinarySearch;

public class AstronomerSearchScenario {
    static int binarySearch(int[] a, int t) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) return m;
            if (a[m] < t) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    static int searchRotated(int[] a, int t) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) return m;
            if (a[l] <= a[m]) {
                if (t >= a[l] && t < a[m]) r = m - 1;
                else l = m + 1;
            } else {
                if (t > a[m] && t <= a[r]) l = m + 1;
                else r = m - 1;
            }
        }
        return -1;
    }

    static int first(int[] a, int t) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] >= t) {
                if (a[m] == t) ans = m;
                r = m - 1;
            } else l = m + 1;
        }
        return ans;
    }

    static int last(int[] a, int t) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] <= t) {
                if (a[m] == t) ans = m;
                l = m + 1;
            } else r = m - 1;
        }
        return ans;
    }

    static int minIndex(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] > a[r]) l = m + 1;
            else r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5, 5, 5, 8};
        System.out.println(binarySearch(s, 4));
        System.out.println(first(s, 5) + " " + last(s, 5));
        int[] rot = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(searchRotated(rot, 2));
        System.out.println(minIndex(rot));
    }
}