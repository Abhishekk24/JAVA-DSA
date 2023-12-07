public class SearchinRoatatedSortedArray {

    static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (target < nums[low] && nums[low] <= nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (target > nums[high] && nums[high] >= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3,1 };
        System.out.println("Target is at index " + search(nums, 1));
    }
}
