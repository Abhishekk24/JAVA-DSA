
import java.util.*;

public class RotateArrays {
    static int[] rotate(int[] arr){
        int[] temp = new int[arr.length];
        for(int i = 0; i< arr.length ; i++){
            temp[(i+1)%temp.length] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5};
        System.out.println("Rotated array is : " + Arrays.toString(rotate(arr1)));
    }
}
