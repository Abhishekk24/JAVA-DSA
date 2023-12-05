public class Main {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {323,4,3},
            {22,3,4,55,121}
        };
        
        
        System.out.println(max(arr));
    }
    static int max(int [][] arr ){
        int max = Integer.MIN_VALUE;
        for (int row= 0; row<=arr.length ; row++){
            for(int col= 0; col<= arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
