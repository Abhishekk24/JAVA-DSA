
import java.util.Arrays;

public class FirstandLastOcc {
    static int[] search(int[] arr, int target) {
        // Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;
        int[] res = new int[] { -1, -1 };

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                res[0] = mid;
                high = mid - 1;

            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                res[1] = mid;
                low = mid + 1;

            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 9 };
        System.out.println("First occurrence of the element is at index: " + Arrays.toString(search(arr, 8)));
    }
}