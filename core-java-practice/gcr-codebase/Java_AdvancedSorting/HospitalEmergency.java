package Java_AdvancedSorting;

import java.util.Arrays;

public class HospitalEmergency {
    public static void main(String[] args) {
        int[] a = {10, 30, 15, 50, 40};
        Arrays.sort(a);
        int k = 2;
        System.out.println(a[a.length - k]);
    }
}
