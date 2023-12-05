class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans ={-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    
    }
     static int search(int[] nums, int target, boolean firstStartIndex) {
        int ans = -1;
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (firstStartIndex) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            else if (nums[mid] <= target) {
                lo = mid + 1;

            } else if (nums[mid] >= target) {
                hi = mid - 1;

            }
        }
        return ans;
    }
}