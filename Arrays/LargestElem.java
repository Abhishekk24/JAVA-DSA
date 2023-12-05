import java.lang.reflect.Array;
import java.util.*;

class LargestElem {
    static int Largest(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static void klargest(int[] arr, int k) {
        Arrays.sort(arr);

        System.out.println(arr[arr.length - k]);
    }

    static int secondlargest(int[] arr) {
        int max = arr[0];
        int min = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                min = max;
                max = arr[i];
            } else if (min < arr[i] && arr[i] != max) {
                min = arr[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4, 5, 6 ,7,7};

        // System.out.println("Largest element is " + Largest(arr));
        // klargest(arr, 2);
        System.out.println("Second largest "+ secondlargest(arr));
    }
}