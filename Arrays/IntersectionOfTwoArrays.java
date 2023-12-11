import java.util.*;

public class IntersectionOfTwoArrays {
    static int[] intersection(int[] num1, int[] num2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i = 0, j = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] == num2[j]) {
                list.add(num1[i]);
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[list.size()];
        int index=0;
        for(int num: list){
            res[index++] = num;
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] num2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(nums1, num2)));
    }
}
