import java.util.Arrays;
import java.util.Collections;

class KoKoBananas {
    public static void main(String[] args) {
        Integer[] arr = {30,11,23,4,20};
        System.out.println(minbanana(arr, 6));
    }

    static int minbanana(Integer[] arr, int h) {
        Arrays.sort(arr); // sorting the array in ascending order
        int max = Collections.max(Arrays.asList(arr));
        int sum = 0;
        int j, rem;
        for (int i = 1; i <= max; i++) {
            sum = 0;
            for (j = 0; j < arr.length; j++) {
                rem = (int) Math.ceil((double) arr[j] / i);
                sum += rem;
            }
            if (sum == h) {
                return i;
            }
        }
        return -1;
    }
}
