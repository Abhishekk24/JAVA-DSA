public class RotateImage {

    static void rotate(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // Create a new matrix to store the rotated values
        int[][] rotated = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][m - 1 - i] = arr[i][j];
            }
        }

        // Copy the rotated matrix back to the original matrix
        for (int i = 0; i < n; i++) {
            System.arraycopy(rotated[i], 0, arr[i], 0, m);
        }
    }



   static void rotater(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // Swap elements
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse the order of columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix: ");
        printMatrix(matrix);

        rotater(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
    }
}