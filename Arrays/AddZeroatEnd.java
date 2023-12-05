import java.util.*;

public class AddZeroatEnd {
    static List<Integer> AtEnd(int[] arr){
        ArrayList<Integer> set = new ArrayList<>();
        int count=0;
        for (int i=0 ;i <arr.length;i++){
            if(!set.contains(arr[i])){
                if(arr[i]==0){
                    count++;
                }
                else{
                    set.add(arr[i]);
                }
            }
        }
        while(count!=0){
            set.add(0);
            count--;
        }
        return set;
    }
                
    public static void main(String[] args) {
        int[] arr ={0,1,0,3,12};
        System.out.println("Zeros at end " + AtEnd(arr));
    }
}


// import java.util.Arrays;

// class Solution {
//     public int[] moveZeroes(int[] nums) {
//         int temp;
//         int j = -1;

       
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 0) {
//                 j = i;
//                 break;
//             }
//         }

        
//         if (j == -1)
//             return nums;

        
//         for (int i = j + 1; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 j++;
//             }
//         }
//         return nums; 
//     }
// }
