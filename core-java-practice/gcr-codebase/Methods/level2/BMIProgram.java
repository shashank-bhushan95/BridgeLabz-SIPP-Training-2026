import java.util.Scanner;

public class BMIProgram {

    public static double calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] person = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Weight(kg): ");
            person[i][0] = sc.nextDouble();

            System.out.print("Height(cm): ");
            person[i][1] = sc.nextDouble();

            person[i][2] =
                    calculateBMI(person[i][0], person[i][1]);

            status[i] = getStatus(person[i][2]);
        }

        System.out.println("\nWeight Height BMI Status");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%.2f %.2f %.2f %s\n",
                    person[i][0],
                    person[i][1],
                    person[i][2],
                    status[i]);
        }
    }
}