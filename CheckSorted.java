public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        boolean isSorted = check(arr, 0);
        System.out.println("Is the array sorted? " + isSorted);
    }

    static boolean check(int[] arr, int index) {
        if (index >= arr.length - 1) {
            // Base case: reached the last element
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            // Base case: elements out of order
            return false;
        }

        // Recursive case: check the next pair of elements
        return check(arr, index + 1);
    }
}
