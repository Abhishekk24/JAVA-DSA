import java.util.Arrays;

class MBouquets {
    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};

        System.out.println(findminday(arr, 3, 2));
    }

    static int findminday(int[] arr, int m, int k) {
        int n = arr.length;
        if (n < m * k) {
            return -1;
        }
        int high = Arrays.stream(arr).max().getAsInt();
        int low = Arrays.stream(arr).min().getAsInt();
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(arr, mid, m, k) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static boolean possible(int[] arr, int mid, int m, int k) {
        int count = 0;
        int noofB = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] <= mid) {
                count++;
            } else {
                noofB = noofB + (count / k);
                count=0;
            }
        }
        noofB += (count / k);

        if (noofB >= m) {
            return true;
        }

        return false;
    }
}
