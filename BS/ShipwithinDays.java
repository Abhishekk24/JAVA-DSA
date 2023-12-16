import java.util.*;
import java.util.stream.IntStream;

public class ShipwithinDays {
    static int search(int[] weights, int days) {
        Arrays.sort(weights);
        int low = weights[weights.length-1];
        int high = IntStream.of(weights).sum();

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (daysToShips(weights, mid) <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int daysToShips(int[] weights, int mid) {
        int count = 1;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] > mid) {
                count++;
                sum = 0;
            }
            sum += weights[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] weights = {3,2,2,4,1,4 };
        System.out.println(search(weights, 3));
    }
}
