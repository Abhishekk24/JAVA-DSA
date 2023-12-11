
import java.util.*;

public class MinSubarraySum {
    static int Longsumsub(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum >= k) {
                    length = j - i + 1;
                    list.add(length);
                }
            }
        }
        int[] result = new int[list.size()];
        int index=0;
        for(int num: list){
            result[index++] = num;
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        return (result.length> 0) ? result[0] : 0;
    }
    
    public static void main(String[] args) {
        int[] arr={12,28,83,4,25,26,25,2,25,25,25,12};
       
        System.out.println( Longsumsub(arr, 213));
    }
}
