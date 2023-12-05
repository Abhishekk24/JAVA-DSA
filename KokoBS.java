import java.util.Arrays;

 class KokoBS {
    public static void main(String[] args) {
        int[] arr = {30, 11, 23, 4, 20};
        System.out.println(minbanana(arr, 6));
    }

    static int minbanana(int[] arr, int h) {
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        while (low < high) {
            int mid = low + (high - low) / 2;
            int hour = count(arr, mid);

            if (hour <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int count(int[] arr, int mid) {
        int hours = 0;
        for (int j = 0; j <= arr.length - 1; j++) {
            int rem = (int) Math.ceil((double) arr[j] / mid);
            hours += rem;
        }
        return hours;
    }
}
