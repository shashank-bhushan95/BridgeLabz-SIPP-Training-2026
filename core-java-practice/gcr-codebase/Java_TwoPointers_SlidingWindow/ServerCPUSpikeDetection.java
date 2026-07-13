package Java_TwoPointers_SlidingWindow;

public class ServerCPUSpikeDetection {
    public static void main(String[] args) {
        int[] a = {2, 5, 1, 8, 2, 9, 1};
        int k = 3, sum = 0, max = Integer.MIN_VALUE, start = 0;
        for (int end = 0; end < a.length; end++) {
            sum += a[end];
            if (end >= k - 1) {
                if (sum > max) max = sum;
                sum -= a[start++];
            }
        }
        System.out.println(max);
    }
}