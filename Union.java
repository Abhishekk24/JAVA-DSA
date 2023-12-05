import java.util.*;

public class Union {
    public static void Union (int nums1[] , int nums2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i< nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i = 0 ; i< nums2.length; i++){
            set.add(nums2[i]);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,4,5,3};
        int[] nums2 = {1,3,6,2,8,9};
        Union(nums1,nums2);
    }
}
