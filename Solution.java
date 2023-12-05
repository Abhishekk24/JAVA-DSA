import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                return key; // Return the first majority element found
            }
        }

        return -1; // Return -1 if no majority element found
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = new Solution().majorityElement(nums);
        
        if (majority != -1) {
            System.out.println(majority);
        } else {
            System.out.println("No majority element found");
        }
    }
}










