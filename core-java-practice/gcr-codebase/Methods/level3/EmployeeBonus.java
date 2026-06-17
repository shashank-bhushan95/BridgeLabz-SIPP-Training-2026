import java.util.Arrays;

public class EmployeeBonus {

    static double[][] generateEmployeeData() {

        double[][] emp = new double[10][2];

        for(int i=0;i<10;i++) {

            emp[i][0] =
                    (int)(Math.random()*90000)+10000;

            emp[i][1] =
                    (int)(Math.random()*10)+1;
        }

        return emp;
    }

    static double[][] calculateBonus(
            double[][] emp) {

        double[][] result =
                new double[10][4];

        for(int i=0;i<10;i++) {

            double salary = emp[i][0];
            double years = emp[i][1];

            double bonus;

            if(years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = salary + bonus;
        }

        return result;
    }

    public static void main(String[] args) {

        double[][] emp =
                generateEmployeeData();

        double[][] result =
                calculateBonus(emp);

        double totalOld=0;
        double totalBonus=0;
        double totalNew=0;

        System.out.println(
                "Salary\tYears\tBonus\tNew Salary");

        for(double[] row : result){

            System.out.printf(
                    "%.0f\t%.0f\t%.2f\t%.2f\n",
                    row[0],row[1],row[2],row[3]);

            totalOld += row[0];
            totalBonus += row[2];
            totalNew += row[3];
        }

        System.out.println(
                "\nTotal Old Salary = "
                        + totalOld);

        System.out.println(
                "Total Bonus = "
                        + totalBonus);

        System.out.println(
                "Total New Salary = "
                        + totalNew);
    }
}