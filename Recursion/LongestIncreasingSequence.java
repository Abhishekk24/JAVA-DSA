import java.util.*;

public class LongestIncreasingSequence {

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

    static int Search(List<List<Integer>> list) {
        int maxlen = 0;
        for (List<Integer> subse : list) {
            int currentlength = 1;
            for (int i = 1; i < subse.size(); i++) {
                if (subse.get(i) > subse.get(i - 1)) {
                    currentlength++;
                } else {
                    break;
                }
            }
            maxlen = Math.max(maxlen, currentlength);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
        List<List<Integer>> subsequence = subsequence(0, arr, new ArrayList<>());
        System.out.println(Search(subsequence));
    }
}
