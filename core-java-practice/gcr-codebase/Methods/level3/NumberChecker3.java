import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    public static int countDigits(int number) {

        int count = 0;

        while(number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] storeDigits(int number) {

        int count = countDigits(number);

        int[] digits = new int[count];

        for(int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] digits) {

        int[] reverse = new int[digits.length];

        int index = 0;

        for(int i = digits.length - 1; i >= 0; i--) {
            reverse[index++] = digits[i];
        }

        return reverse;
    }

    public static boolean compareArrays(int[] a, int[] b) {

        if(a.length != b.length)
            return false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i])
                return false;
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {

        int[] reverse = reverseArray(digits);

        return compareArrays(digits, reverse);
    }

    public static boolean isDuckNumber(int[] digits) {

        for(int digit : digits) {
            if(digit == 0)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Digits = " +
                Arrays.toString(digits));

        System.out.println("Palindrome = " +
                isPalindrome(digits));

        System.out.println("Duck Number = " +
                isDuckNumber(digits));
    }
}