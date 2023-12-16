public class ArrangingCoins {
    static int target(int n) {
        // int count=0;
        // for(int i =1; i<=n ; i++){
        // if (n>=i) {
        // n -= i;
        // count++;
        // }
        // }
        // return count;

        int low = 1;
        int high = n;

        while (low < high) {
            long mid = low + (high - low) / 2;
            if ((mid * (mid + 1) / 2) == n) {
                return (int) mid;
            } else if ((mid * (mid + 1) / 2) > n) {
                high = (int) mid - 1;
            } else {
                low = (int) mid + 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Minimum number of coins required to make " + n + " is : " + target(n));
    }
}
