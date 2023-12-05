// import java.util.ArrayList;
// import java.util.List;

// public class ArrayPermutation {
//     public static void main(String[] args) {
//         int[] b = { 1, 2, 3 };
//         List<List<Integer>> list = generatepermu(b);

//     }

//     static List<List<Integer>> generatepermu(int[] b) {
//         List<List<Integer>> perm = new ArrayList<>();
//         perm.add(new ArrayList<>());
        
//         return perm;
//     }

// }
import java.util.ArrayList;
import java.util.List;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);
        System.out.println(permutations);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, current, result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) {
                continue;
            }
            current.add(nums[i]);
            backtrack(nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}

