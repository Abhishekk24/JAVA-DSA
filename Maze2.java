import java.util.Arrays;

public class Maze2 {
    public static void main(String[] args) {
        boolean [][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        // find("", board, 0, 0);
        findpath("", board, 0, 0, path, 1);
        
    }
    static void find (String p , boolean[][] maze ,int r , int c){
        if(r == maze.length -1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r < maze.length-1){
            find(p+"D",maze , r+1, c);
        }
        if(c < maze[0].length-1){
            find(p+"R",maze , r, c+1);
        }
        if(r>0){
            find(p+"U", maze, r-1, c);
        }
        if(c>0){
            find(p+"L", maze, r, c-1);
        }
        maze[r][c] = true;
    }
    static void findpath (String p , boolean[][] maze ,int r , int c , int[][] path, int steps){
        if(r == maze.length -1 && c == maze[0].length-1){
            path[r][c] = steps;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        path[r][c] = steps;
        maze[r][c] = false;
        if(r < maze.length-1){
            findpath(p+"D",maze , r+1, c, path , steps+1);
        }
        if(c < maze[0].length-1){
            findpath(p+"R",maze , r, c+1, path , steps+1);
        }
        if(r>0){
            findpath(p+"U", maze, r-1, c, path , steps+1);
        }
        if(c>0){
            findpath(p+"L", maze, r, c-1, path , steps+1);
        }
        path[r][c] =0;
        maze[r][c] = true;
        
    }
}
