public class Sqrt {
    static int find(int num) {
        if (num <= 1) {
            return num;
        }

        int start = 1;
        int end = num;
        int ans = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= num / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int num = 8;
        int sqrt = find(num);
        System.out.println("The square root of " + num + " is " +  sqrt);
    }
}
