import java.util.Arrays;
public class MinWeight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(minweight(arr,5));

    }
    static int minweight(int[] arr,int days){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while(low<=high){
            int mid = low + (high-low)/2;

            if(count(arr,mid)<= days){
              high = mid -1;  
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
     static int count(int[] arr, int mid) {
        int day=1;
        int load=0;
        for(int i =0 ; i<= arr.length-1;i++){
            
            if(load+ arr[i] > mid){
                day++;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
        }
        return day;
    }
}
