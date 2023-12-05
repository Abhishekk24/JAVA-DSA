import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    static void LongestSequence(int[] arr) {
        Arrays.sort(arr);
        int prevcount = 0;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else if (arr[i + 1] != arr[i]) {
                // Reset count if the current and next elements are not the same
                count = 0;
            }

            if (count > prevcount) {
                prevcount = count;
            }
        }

        // Adding 1 to include the current element in the consecutive sequence
        System.out.println(prevcount + 1);
    }
    static int longest(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int maxlen = 0, currlen = 0;

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                int currentNum = num;

                while (set.contains(currentNum + 1)) {
                    currlen += 1;
                    currentNum++;
                }

                maxlen = Math.max(maxlen, currlen);
                currlen = 0; // Reset currlen outside the while loop
            }
        }

        return Math.max(maxlen, currlen)+1;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 8, 9, 1, 2, 3, 4, 0 };
        // LongestSequence(arr);
        System.out.println(longest(arr));
    }
}
