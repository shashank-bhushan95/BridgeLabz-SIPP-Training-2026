import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {

        int eachChild = chocolates / children;
        int remaining = chocolates % children;

        return new int[]{eachChild, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter Number of Children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each Child Gets = " + result[0]);
        System.out.println("Remaining Chocolates = " + result[1]);
    }
}