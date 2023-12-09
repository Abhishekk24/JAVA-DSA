public class Sqrt {
    static int find(int num) {
        int start = 0;
        int end = num;
        int ans=0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid * mid <= num) {
               ans =mid;
                start = mid+1;
            }  else {
                end = mid-1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int num = 8;
        int sqrt = find(num);
        System.out.println("The square root of " + num + " is " +  sqrt);
    }
}
