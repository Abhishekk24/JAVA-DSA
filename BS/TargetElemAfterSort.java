import java.util.*;

public class TargetElemAfterSort {
    static List<Integer> searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        search(nums, target, true, list);
        search(nums, target, false, list);

        Collections.sort(list); // Sort the list before returning it
        return list;
    }

    static void search(int[] nums, int target, boolean firstStartIndex, List<Integer> list) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                if (!list.contains(mid)) {
                    list.add(mid);
                }
                if (firstStartIndex) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 3};
        TargetElemAfterSort t = new TargetElemAfterSort();
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.print("Target Element is at indices: ");
        List<Integer> indices = searchRange(arr, 2);
        System.out.println(indices);
    }
}
