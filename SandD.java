public class SandD {
    public static void main(String[] args) {

        int[] arr = { 3, 0, 1, 3, 4 };
        sort(arr, arr.length - 1, 0);
        for (int i : arr) {
            System.out.print(" " + i);
        }
        

    }

    static void sort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;

            }
            sort(arr, r, c + 1);

        } else {
            sort(arr, r - 1, 0);
        }

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == i && arr[i + 1] == i) {
                System.out.println(arr[i]);
            }
        }

    }
}
