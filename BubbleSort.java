public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
         int ans = bubble(arr);
        // int ans = Duplicate(arr);
         System.out.println(ans);
        // printArray(arr);
    }

    public static int bubble(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    count++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                else{
                    continue;
                }
            }
        }
        for (int i = 0 ; i < n-1; i++){
            if(arr[i]== i && arr[i+1] == i){
                return i;
            }
            
        }
        return arr[0];
    }
    static int Duplicate(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n; i++){
            if(arr[i]== i && arr[i+1] == i) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

