import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class TwoSum {
    static List<List<Integer>> twosum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    List<Integer> pair = Arrays.asList(arr[i], arr[j]);
                    result.add(pair);
                }
            }
        }
        return result;
    }

    static int[] findtwosum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = k - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println(twosum(arr, 9));
        int[] nums = { 2, 7, 11, 15 };
        int k = 9;
        System.out.println("Two sum array: " + Arrays.toString(findtwosum(nums, k)));
    }
}
