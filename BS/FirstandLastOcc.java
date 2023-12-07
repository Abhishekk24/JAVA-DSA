import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstandLastOcc {
    static int[] search(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int low = 0;
        int high = arr.length - 1;
        int[] res = new int[2];
         int indx=0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                list.add(mid - 1);
                list.add(mid);
               
                for(int nums:list){
                    res[indx++] = nums;
                }
                return res;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        list.add(-1);
        list.add(-1);
        for(int nums:list){
                    res[indx++] = nums;
                }
                return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        System.out.println("First occurrence of the element is at index: " + search(arr, 8));
    }
}