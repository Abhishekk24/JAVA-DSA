import java.util.Arrays;

public class SmallestDivisor {
    public static void main(String[] args) {
        int [] arr = {44,22,33,11,1};

        

        System.out.println(smalldiv(arr, 5));

    }
    static int smalldiv(int[] arr , int threshold){
        int low = Arrays.stream(arr).min().getAsInt();
        int high = Arrays.stream(arr).max().getAsInt();
        int ans = high;
        while(low<= high){
            int mid = low+ (high-low)/2;
            if(count(arr, mid ,threshold)== true){
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid + 1 ;
            }
        }
        return ans;
    }
    static boolean count(int[] arr , int mid , int threshold){
        int count =0;
        for (int i =0 ; i <= arr.length-1; i++){
            count+=(int) Math.ceil((double) arr[i]/mid);
        }
        if(count <= threshold){
            return true;
        }
        return false;
    }
}
