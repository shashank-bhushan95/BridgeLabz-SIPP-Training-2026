import java.util.Scanner;

public class StudentGrade {

    public static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {

            marks[i][0] = (int) (Math.random() * 100);
            marks[i][1] = (int) (Math.random() * 100);
            marks[i][2] = (int) (Math.random() * 100);
        }

        return marks;
    }

    public static String grade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";

        return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        System.out.println(
                "Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double avg = Math.round((total / 3.0) * 100.0) / 100.0;

            double per = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            total + "\t" +
                            avg + "\t" +
                            per + "\t\t" +
                            grade(per));
        }
    }
}