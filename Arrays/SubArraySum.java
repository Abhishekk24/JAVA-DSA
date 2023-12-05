import java.util.HashMap;

public class SubArraySum {
    static int subarraySum(int[] arr, int target) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;  // Initialize sum for each subarray starting at index i
            
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];  // Add the current element to the sum
                
                if (sum == target) {
                    count++;  // Increment count if the sum equals the target
                }
                else{
                    
                }
            }
        }
    
        return count;
    }
    
    public static void main(String[] args) {
        int[] sum={1,1,1};
        System.out.println("Subarrays -> "+subarraySum(sum,2));

    }
}
