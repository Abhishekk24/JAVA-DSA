import java.util.Arrays;
public class bookallocation {
    public static void main(String[] args) {
        int[] arr = {25,46,28,49,24};

        System.out.println(min(arr,4));


    }
    static int min(int[] arr ,int m){
        int low= Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while(low <= high){
            int mid = low + (high-low)/2;
            int count = check(arr,mid);

            if(count > m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    static int check(int[] arr, int mid) {
        int stu = 1; int pages = 0;
        for (int i = 0; i<= arr.length-1 ; i++){
            if(arr[i]+pages<=mid){
                pages = pages +arr[i];
            }
            else{
                stu++;
                pages= arr[i];
            }
        }
        return stu;
    }
    
}
