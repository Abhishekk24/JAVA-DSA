import java.util.Arrays;
public class Sorted2D {
    public static void main(String[] args) {
        int[][] arr ={

            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24}

        };
        System.out.println(Arrays.toString(search(arr, 3)));

    }

    static int[] binSearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            // mid index
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target)
                return new int[] { row, mid };
            else {
                if (arr[row][mid] < target) {
                    cStart = mid + 1;
                } else {
                    cEnd = mid - 1;
                }
            }
            System.out.println("not found");
            break;
        }
        return null;
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows== 1){
            return binSearch(arr, 0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while(rStart < (rEnd -1)){
            int mid = rStart +(rEnd -rStart)/2;
            if(arr[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(arr[mid][cMid] < target){
                rStart=mid;
            }
            else{
                rEnd = mid;
            }
        }

        if(arr[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        if(arr[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }

        if(target <= arr[rStart][cMid-1]){
            return binSearch(arr, rStart, 0, cMid-1, target);
        }
        if(target >= arr[rStart][cMid+1] && target <= arr[rStart][cols-1]){
            return binSearch(arr, rStart, cMid+1, cols-1, target);
        }
        if(target <= arr[rStart+1][cMid-1]){
            return binSearch(arr, rStart+1, 0, cMid, target);
        }
       else{
        return binSearch(arr, rStart+1, cMid, cols-1, target);
       }

    }
}

