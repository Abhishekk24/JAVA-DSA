public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 9,6,4,3,3,5,7,1};
        missingNumber(arr);
        System.out.println(missingNumber(arr));
        printArray(arr);
    }

//     public static int cycleSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int correct = arr[i];
//             if (arr[i] < n && arr[i] != arr[correct]) {
//                 int temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }

//         }
//         for (int in = 0; in < n; in++) {
//             if (arr[in] != in) {
//                 return in;
//             }

//         }
//         return n;
//     }

//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }




    public static int missingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int correct = arr[i]-1;
            if (arr[i] < n && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            
        }
        for (int in = 0; in < n; in++) {
            if (arr[in] != in+1) {
                return in+1;
            }

        }
        return n;
    }
            public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
    }
}