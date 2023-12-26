import java.util.HashSet;

public class isPathCrossing {
    static boolean check(String path) {

        // int n = path.length();
        // int row = 500; // Starting from the middle of the matrix
        // int col = 500; // Starting from the middle of the matrix
        // int[][] res = new int[1000][1000]; // Adjust the size as needed
        // res[row][col] = 1;
        int col = 0;
        int row =0;
        HashSet<String> set = new HashSet<>();
        set.contains("0,0");

        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            // Update matrix based on the direction
            if (c == 'S') {
                row--;
            } else if (c == 'E') {
                col++;
            } else if (c == 'N') {
                row++;
            } else if (c == 'W') {
                col--;
            }
            String m = row + "." + col;

            if (set.contains(m)) {
                return true;
            }
            set.add(m);

            // Check if the current position is visited before
            // if (res[row][col] == 1 ) {
            // return true;
            // }

            // // Mark the current position as visited
            // res[row][col] = 1;
        }
        return false;
    }

    public static void main(String[] args) {
        String path = "NESWW";
        boolean result = check(path);
        System.out.println(result);
    }
}
