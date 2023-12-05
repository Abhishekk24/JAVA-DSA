public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6, 7, 8, 9, 0};
        insertionSort(arr);
        printArray(arr);
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n-2; i++) {
            int j = i + 1;
            while (j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;

            }

        }
        
        
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
