public class RecursivePattern {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        // bubblesort(arr, arr.length - 1, 0);
        selectionsort(arr, arr.length , 0, 0);
        printarray(arr);

    }

    static void pattern(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("*");
            pattern(r, c + 1);

        } else {
            System.out.println();
            pattern(r - 1, 0);

        }
    }

    static void bubblesort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;

            }
            bubblesort(arr, r, c + 1);

        } else {
            bubblesort(arr, r - 1, 0);
        }
    }

    static void selectionsort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[max]) {
                selectionsort(arr, r, c+1, c);
            } else {
                selectionsort(arr, r, c+1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionsort(arr, r-1, 0, 0);
        }

    }

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
