public class NthRoot {
    static int find(int num, int root) {

        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (Math.pow(mid, root) == num)
                return mid;
            if (Math.pow(mid, root) < num)
                return start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }

    public static void main(String[] args) {
        int num = 69;
        int root = 4;
        System.out.println(find(num, root));
    }
}
