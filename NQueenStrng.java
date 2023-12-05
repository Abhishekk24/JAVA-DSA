import java.util.ArrayList;
import java.util.List;

public class NQueenStrng {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);

        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> solutions = new ArrayList<>();
        nqueen(board, 0, solutions);
        return solutions;
    }

    static int nqueen(boolean[][] board, int row, List<List<String>> solutions) {
        if (row == board.length) {
            List<String> solution = display(board);
            solutions.add(solution);
            return 1;
        }
        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += nqueen(board, row + 1, solutions);
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

    private static List<String> display(boolean[][] board) {
        List<String> solution = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean elem : row) {
                if (elem) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            solution.add(sb.toString());
        }
        return solution;
    }
}
