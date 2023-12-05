import java.util.Arrays;

public class sortedsquare {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        arr = sortedSquares(arr);
        System.err.println(Arrays.toString(arr));
        
    }

    static int[] sortedSquares(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int n = arr.length - 1;

        int[] result = new int[n + 1];

        while (s < e) {
            int a = (int) Math.pow(arr[s], 2);
            int b = (int) Math.pow(arr[e], 2);

            if(a > b){
               result[n] = a;
               s++;
           }else{
               result[n] = b;
               e--;;
           }

           n--;

        }
        return result;

    }
}
