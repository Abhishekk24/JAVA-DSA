public class Maze {
    public static void main(String[] args) {
        find("", 3, 3);

    }

    static void find(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            find(p + "D", r - 1, c);
        }
        if (c > 1) {
            find(p + "R", r, c - 1);
        }

    }
}
