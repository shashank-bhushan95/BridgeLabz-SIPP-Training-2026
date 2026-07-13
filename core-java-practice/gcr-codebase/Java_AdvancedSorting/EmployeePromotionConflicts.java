package Java_AdvancedSorting;

public class EmployeePromotionConflicts {
    public static void main(String[] args) {
        int[] a = {70, 95, 80, 100};
        int c = 0;
        for (int i = 0; i < a.length; i++) for (int j = i + 1; j < a.length; j++) if (a[i] < a[j]) c++;
        System.out.println(c);
    }
}
