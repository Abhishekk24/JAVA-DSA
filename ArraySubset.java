import java.util.ArrayList;
import java.util.List;

public class ArraySubset {
    public static void main(String[] args) {
        int[] b = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(b);
        System.out.println(subsets);
    }

    static List<List<Integer>> generateSubsets(int[] b) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // Add an empty subset

        for (int i = 0; i < b.length; ++i) {
            int currentElement = b[i];
            int subsetsCount = subsets.size();

            for (int j = 0; j < subsetsCount; ++j) {
                List<Integer> subset = new ArrayList<>(subsets.get(j));
                subset.add(currentElement);
                subsets.add(subset);
            }
        }

        return subsets;
    }
}
