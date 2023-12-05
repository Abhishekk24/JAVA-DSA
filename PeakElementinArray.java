public class PeakElementinArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1};
        int index = search(arr, 2);
        System.out.println(index);
    }

    public static int search(int[] arr, int target) {
        
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                hi = mid - 1;
                if (arr[mid] < target) {
                    lo = mid + 1;
                } else {
                    lo = mid;
                }
            } else if (arr[mid] < target) {
                lo = mid + 1;
                if (arr[mid] > target) {
                    hi = mid - 1;
                } else {
                    hi = mid;
                }
            }
        }
        return lo;
    }

    public static int bs(int[] arr) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid + 1]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
