public class CountNegativeinMatrix {
    static int count(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int count=0;

        for(int i =0 ; i<m ; i++){
            for(int j=0 ;j<n ; j++){
                if(arr[i][j] < 0){
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int mat[][] = {{4, 2, -1}, {-3, 5, 0}};
        System.out.println("Count of negative numbers in the matrix is " +count(mat));
    }
}
