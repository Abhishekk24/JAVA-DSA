import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leader {
    static List<Integer> leader(int[] arr) {
        List<Integer> result = new ArrayList<>();
        if (arr.length == 0) return result;

        int maxFromRight = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {22, 1, 23, 45, 12, 43, 3};
        List<Integer> leaders = leader(arr);
        System.out.println("Leader array is " + leaders);
    }
}
