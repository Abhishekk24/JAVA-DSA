public class SetMatrix {
    static void setMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[] col = new int[arr.length];
        int[] row = new int[arr.length];

        // Identify the rows and columns containing zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set rows and columns to zero based on the identified zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};

        System.out.println("Original Matrix:");
        printMatrix(arr);

        setMatrix(arr);

        System.out.println("\nModified Matrix:");
        printMatrix(arr);
    }
}
