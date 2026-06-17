import java.util.Scanner;

public class FriendsInfo {

    public static int findYoungest(int[] age) {

        int index = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[index])
                index = i;
        }

        return index;
    }

    public static int findTallest(double[] height) {

        int index = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[index])
                index = i;
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter Height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        System.out.println("Youngest Friend = " +
                names[findYoungest(age)]);

        System.out.println("Tallest Friend = " +
                names[findTallest(height)]);
    }
}