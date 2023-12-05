public class NQueens {
    public static void main(String[] args) {
        int n  = 4;
        boolean[][] board = new boolean[n][n];
        nqueen(board, 0);


    }

    static int nqueen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println("");
            return 1;
        }
        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count = count + nqueen(board, row + 1);
                board[row][col] = false;
            }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxleft = Math.min(row, col);
        for (int i = 0; i <= maxleft; i++) {
            if (board[row - i][col - i])
                return false;
        }
        int maxright = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxright; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;

    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean elem : row) {
                System.out.print((elem) ? "Q" : ".");
            }
            System.out.println();
        }

    }
}
