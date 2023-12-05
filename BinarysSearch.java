public class BinarysSearch {
    public static void main(String[] args) {
        int[] arr = { 3,4,6,8,9};
        int target = 8;
        int ans = bs(arr,target);
        System.out.println(ans);

    }

    public static int bs(int[] arr, int target) {
        int n = arr.length;
        int lo = arr[0];
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo+(hi-lo) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] <= target) {
                lo = mid + 1;

            } else if (arr[mid] >= target) {
                hi = mid - 1;
            }
            else if(arr[mid]!= target){
                return mid = mid+1;
            }

        }
        return -1;
    }

}
