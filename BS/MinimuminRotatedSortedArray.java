
import java.util.*;
public class MinimuminRotatedSortedArray {
    static int search(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Math.max(low, high);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= nums[low]) {
                ans = Math.min(ans, nums[mid]);
                high = mid-1;
            } else  {
                ans = Math.min(ans,nums[low]);
                low = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 11,13,15,17};
        System.out.println(search(arr));
    }

}
