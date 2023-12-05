public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {3,24,2,1,9};
        
        System.out.println(search(arr, 33, 0));
    }
    static boolean search(int [] arr , int target , int index){
         if (index >= arr.length) {
            // Base case: reached the end of the array
            return false;
        }

        if(arr[index] == target){
            return true;
        }
        return search(arr, target, index+1);
    }
}
