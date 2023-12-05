public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 8, 11 };
        int ans = ceiling(arr, 2);
        System.out.println(ans);
    }

    public static int ceiling(int[] arr, int target) {
        int n = arr.length;
        int lo = arr[0];
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] <= target) {
                lo = mid + 1;

            } else if (arr[mid] >= target) {
                hi = mid - 1;

            }}
            return lo;
        }
}
