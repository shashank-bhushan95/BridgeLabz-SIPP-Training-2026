package Java_TwoPointers_SlidingWindow;

public class PairSumFraudDetection {
    static int[] findPair(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int s = a[l] + a[r];
            if (s == target) return new int[]{a[l], a[r]};
            if (s < target) l++;
            else r--;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] a = {1000, 5000, 12000, 18000, 30000};
        int[] ans = findPair(a, 17000);
        System.out.println(ans[0] + " " + ans[1]);
    }
}