import java.util.Arrays;

public class NthDigit{
    static int search(int n){
        if (n <= 0) return -1;
        int[] res = new int[n];
        for(int i =0 ; i<=n-1 ; i++){
             res[i] = i+1;   
        }
        String string = new String();
        for(int i =0 ; i< n; i++){
            string +=res[i];
        }
      
        int[] result = new int[string.length()];

        for(int i =0 ; i< string.length();i++){
            result[i]= Integer.parseInt(String.valueOf(string.charAt(i)));
        }
        
        int low=0;
        int high = result.length;

        while(low<=high){
            int mid = (low + high)/2;
            if(mid == n){
                return result[mid-1];
            }
            else if(mid < n){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int n =11;
        System.out.println(search(n));
    }
}