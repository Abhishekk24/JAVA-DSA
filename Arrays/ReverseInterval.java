public class ReverseInterval {
    static int reverse(int[] arr){
        if (arr == null || arr.length <= 1) return -1;
        int count=0;
       for(int i =0 ; i< arr.length ; i++){
        for(int j =i+1 ; j < arr.length ; j++){
            if(i !=j && arr[i] > arr[j]){
                if(arr[j]*2<arr[i]){
                    count++;
                }
            }
        }
       }
       return count;
    }
   static public  void  main(String[] args) {
        int[] arr={2,4,3,5,1};
        System.out.println("Number of reversed intervals : "+reverse(arr));
    }
}
