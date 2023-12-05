import java.util.Arrays;

class Rough {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                merged[k] = nums1[i];
                i--;
            } else {
                merged[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            merged[k] = nums2[j];
            j--;
            k--;
        }

        while (i >= 0) {
            merged[k] = nums1[i];
            i--;
            k--;
        }

        int mid = merged.length / 2;
        if (merged.length % 2 == 0) {
            double s = merged[mid - 1];
            double e = merged[mid];
            return (s + e) / 2;
        } else {
            return merged[mid];
        }
    }
}
