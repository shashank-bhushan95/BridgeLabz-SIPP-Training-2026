import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];

        for(int i = 0; i < students; i++) {

            for(int j = 0; j < 3; j++) {

                marks[i][j] =
                        (int)(Math.random() * 90) + 10;
            }
        }

        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {

        int students = marks.length;

        double[][] result = new double[students][3];

        for(int i = 0; i < students; i++) {

            int total = 0;

            for(int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = total / 3.0;
            double percentage = total / 3.0;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    public static void displayScoreCard(
            int[][] marks,
            double[][] result) {

        System.out.println(
                "Phy\tChem\tMath\tTotal\tAvg\tPercent");

        for(int i = 0; i < marks.length; i++) {

            System.out.println(
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);

        double[][] result = calculateResults(marks);

        displayScoreCard(marks, result);
    }
}