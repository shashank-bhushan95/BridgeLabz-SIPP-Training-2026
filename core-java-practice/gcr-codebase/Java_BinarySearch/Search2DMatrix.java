package Java_BinarySearch;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] m = {{1, 3, 5}, {7, 9, 11}, {13, 15, 17}};
        int t = 9, row = m.length, col = m[0].length, l = 0, r = row * col - 1;
        boolean f = false;
        while (l <= r) {
            int mid = (l + r) / 2;
            int v = m[mid / col][mid % col];
            if (v == t) {
                f = true;
                break;
            }
            if (v < t) l = mid + 1;
            else r = mid - 1;
        }
        System.out.println(f);
    }
}