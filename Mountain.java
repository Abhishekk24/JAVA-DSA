class Mounatain {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,6,5,4,3,2,1};
        int ans = findInMountainArray(3,mountainArr);
        System.out.println(ans);
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeak(mountainArr);
        int firstSearch = binarySearch(mountainArr, target, 0, peak);
        if (firstSearch != -1) {
            return firstSearch;
        }
        return binarySearchDescending(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    static int findPeak(int[] mountainArr) {
        int left = 0;
        int right = mountainArr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr[mid]< mountainArr[mid+1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    static int binarySearch(int[] mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mountainArr[mid] == target) {
                return mid;
            } else if (mountainArr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearchDescending(int[] mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mountainArr[mid] == target) {
                return mid;
            } else if (mountainArr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
