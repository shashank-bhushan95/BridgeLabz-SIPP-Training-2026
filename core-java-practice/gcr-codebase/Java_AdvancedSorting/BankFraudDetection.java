package Java_AdvancedSorting;

public class BankFraudDetection {
    public static void main(String[] args) {
        int[] a = {12, 4, 5, 2};
        int c = 0;
        for (int i = 0; i < a.length; i++) for (int j = i + 1; j < a.length; j++) if (a[i] > 3 * a[j]) c++;
        System.out.println(c);
    }
}
