public class Recursion {
    public static void main(String[] args) {
        int n = 1342;
        int ans = fun(n);
        System.out.println(ans);

    }

    public static int fun(int n) {

        if (n == 0) {
            return 0;
        }

        int m = n % 10;
        n = n / 10;

        return m + fun(n);

    }

}
