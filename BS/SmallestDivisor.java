import java.util.*;
public class SmallestDivisor {
    static int search(int[] arr, int t){
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length - 1];
        List<Integer> list = new ArrayList<>();

        while (low <= high) {
            int mid = (low + high) / 2;
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + Math.ceil((double) arr[i] / mid);  
            }
            if ((int) sum == t) {
                list.add(mid);
                high = mid - 1;
            } else if ((int) sum < t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int[] result = new int[list.size()];
        int index=0;
        for(int num:list){
            result[index++] = num;
        }
        Arrays.sort(result);
        return result[0];
    }

    public static void main(String[] args) {
        int[] arr = {200,100,14};
        System.out.println(search(arr, 10));
    }
}
