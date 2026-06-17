public class MatrixAdvanced {

    public static int[][] transpose(
            int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] trans =
                new int[cols][rows];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                trans[j][i] = matrix[i][j];
            }
        }

        return trans;
    }

    public static int determinant2x2(
            int[][] m) {

        return m[0][0] * m[1][1]
                - m[0][1] * m[1][0];
    }

    public static int determinant3x3(
            int[][] m) {

        return m[0][0] *
                (m[1][1] * m[2][2]
                        - m[1][2] * m[2][1])

                - m[0][1] *
                (m[1][0] * m[2][2]
                        - m[1][2] * m[2][0])

                + m[0][2] *
                (m[1][0] * m[2][1]
                        - m[1][1] * m[2][0]);
    }

    public static void inverse2x2(
            int[][] m) {

        int det = determinant2x2(m);

        if(det == 0) {
            System.out.println(
                    "Inverse Not Possible");
            return;
        }

        System.out.println(
                (double)m[1][1]/det + "\t" +
                (double)-m[0][1]/det);

        System.out.println(
                (double)-m[1][0]/det + "\t" +
                (double)m[0][0]/det);
    }

    public static void display(
            int[][] matrix) {

        for(int[] row : matrix) {

            for(int value : row) {

                System.out.print(
                        value + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {0,1,4},
                {5,6,0}
        };

        System.out.println("Matrix");
        display(matrix);

        System.out.println(
                "\nTranspose");

        display(transpose(matrix));

        System.out.println(
                "\nDeterminant 3x3 = "
                        + determinant3x3(matrix));

        int[][] matrix2 = {
                {4,7},
                {2,6}
        };

        System.out.println(
                "\nDeterminant 2x2 = "
                        + determinant2x2(matrix2));

        System.out.println(
                "\nInverse 2x2");

        inverse2x2(matrix2);
    }
}