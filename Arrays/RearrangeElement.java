import java.util.*;

public class RearrangeElement {
    static int[] rearrangeArray(int[] arr) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : arr) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int[] rearranged = new int[arr.length];
        int posIdx = 0;
        int negIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && posIdx < positive.size()) {
                rearranged[i] = positive.get(posIdx++);
            } else if (negIdx < negative.size()) {
                rearranged[i] = negative.get(negIdx++);
            }
        }

        return rearranged;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] rearrangedArr = rearrangeArray(arr);

        // Print the rearranged array
        for (int num : rearrangedArr) {
            System.out.print(num + " ");
        }
    }
}
