import java.util.Scanner;

public class MatrixOperations {

    public static int[][] createMatrix(
            int rows,
            int cols) {

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                matrix[i][j] =
                        (int)(Math.random() * 10);
            }
        }

        return matrix;
    }

    public static int[][] add(
            int[][] A,
            int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result =
                new int[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                result[i][j] =
                        A[i][j] + B[i][j];
            }
        }

        return result;
    }

    public static int[][] subtract(
            int[][] A,
            int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result =
                new int[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                result[i][j] =
                        A[i][j] - B[i][j];
            }
        }

        return result;
    }

    public static int[][] multiply(
            int[][] A,
            int[][] B) {

        int rows = A.length;
        int cols = B[0].length;

        int[][] result =
                new int[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                for(int k = 0;
                    k < B.length;
                    k++) {

                    result[i][j] +=
                            A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void display(int[][] matrix) {

        for(int[] row : matrix) {

            for(int value : row) {

                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A = createMatrix(3,3);
        int[][] B = createMatrix(3,3);

        System.out.println("Matrix A");
        display(A);

        System.out.println("\nMatrix B");
        display(B);

        System.out.println("\nAddition");
        display(add(A,B));

        System.out.println("\nSubtraction");
        display(subtract(A,B));

        System.out.println("\nMultiplication");
        display(multiply(A,B));
    }
}