package Java_TwoPointers_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class APIRateLimiterWindow {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 4, 2, 3};
        int n = 2, l = 0, max = 0;
        Map<Integer, Integer> f = new HashMap<>();
        for (int r = 0; r < a.length; r++) {
            f.put(a[r], f.getOrDefault(a[r], 0) + 1);
            while (f.size() > n) {
                f.put(a[l], f.get(a[l]) - 1);
                if (f.get(a[l]) == 0) f.remove(a[l]);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        System.out.println(max);
    }
}