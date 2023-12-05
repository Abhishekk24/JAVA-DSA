public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Rotate(arr, 3);
        for(int i : arr){
            System.out.print(" "+i+" ");
            }
        
    }
    static void Rotate(int [] arr , int k){
        if(k > arr.length || k <=0 ){
            return;
        }
        Reverse(arr, 0, arr.length-1);
        Reverse(arr,  0, k-1 );
        Reverse(arr, k, arr.length -1);

    }
    static void Reverse(int[] arr , int start , int end){
        while (start < end )
        {
            //swap
            int temp = arr[end];
            arr[end]  =arr [start ];
            arr[start ]=temp;
            ++start ; --end;

        }
       

    }
}
