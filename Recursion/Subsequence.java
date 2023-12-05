import java.util.*;

public class Subsequence {
    static List<List<Integer>> subsequence(int ind, int[] arr, List<Integer> ds) {
        List<List<Integer>> list = new ArrayList<>();
        if (ind >= arr.length) {
            list.add(new ArrayList<>(ds));
            return list;
        }
        
        ds.add(arr[ind]);
        list.addAll(subsequence(ind + 1, arr, ds));
        ds.remove(ds.size() - 1);
        list.addAll(subsequence(ind + 1, arr, ds));

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> subsequences = subsequence(0, arr, ds);

        // Sorting the list of subsequences
        subsequences.sort(Comparator.comparing(list -> list.toString()));

        System.out.println(subsequences);
    }
}
