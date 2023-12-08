public class PeakElement {

    static int search(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return 0; // There's only one element, and it's a peak.
        }

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || nums[mid - 1] <= nums[mid]) && (mid == n - 1 || nums[mid + 1] <= nums[mid])) {
                return mid; // Found a peak element
            } else if (mid > 0 && nums[mid - 1] > nums[mid]) {
                high = mid - 1; // Peak must be in the left half
            } else {
                low = mid + 1; // Peak must be in the right half
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 5, 6, 4 };
        System.out.println(search(arr));
    }
}
