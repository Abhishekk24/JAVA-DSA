import java.util.ArrayList;
import java.util.*;

public class LongestSubarray {
    static int Longsumsub(int[] arr, int k) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,3,1,4};
       
        System.out.println( Longsumsub(arr, 2));
    }
}
