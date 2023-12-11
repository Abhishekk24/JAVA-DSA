public class ValidPerfectSquare {
    static boolean isPerfectSquare(int num) {
       
        double low = 1;
        double high = num;
        double ans = 1;

        while (low <= high) {
            double mid = low + (high - low)/ 2;
            if (mid*mid <=num) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(ans% (int)ans == 0){
            return true;
        }
        return false ;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
}
