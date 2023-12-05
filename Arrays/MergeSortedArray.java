import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeSortedArray {
    static int[] merge(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if(!set.contains(arr2[j])){
                set.add(arr2[j]);
            
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int i : set){
            result[index++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = { 2,5,6 };
        System.out.println("Merged array is: " + Arrays.toString(merge(arr1, arr2)));
    
    }
}
