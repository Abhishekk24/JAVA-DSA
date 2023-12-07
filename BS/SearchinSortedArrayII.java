public class SearchinSortedArrayII {
    static boolean search(int[] nums, int target){
        if (nums == null || nums.length == 0)
        return false;
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return true;
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
    return false;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1};
        System.out.println("Searching for element in array: "+search(arr,0));
    }
}
