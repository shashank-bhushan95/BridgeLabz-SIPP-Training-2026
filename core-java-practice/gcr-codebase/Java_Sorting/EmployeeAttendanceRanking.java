package Java_Sorting;

import java.util.Arrays;

public class EmployeeAttendanceRanking {
    public static void main(String[] args) {
        int[] id = {101, 102, 103, 104, 105};
        int[] at = {92, 85, 98, 92, 80};
        for (int i = 0; i < id.length - 1; i++)
            for (int j = i + 1; j < id.length; j++)
                if (at[j] > at[i] || (at[j] == at[i] && id[j] < id[i])) {
                    int t = at[i];
                    at[i] = at[j];
                    at[j] = t;
                    t = id[i];
                    id[i] = id[j];
                    id[j] = t;
                }
        System.out.println(Arrays.toString(Arrays.copyOf(id, 3)));
    }
}