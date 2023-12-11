public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MAX_VALUE;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(piles, mid, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static boolean isFeasible(int[] piles, int speed, int hours) {
        int totalHours = 0;
        for (int bananas : piles) {
            totalHours += (int) Math.ceil((double) bananas / speed);
        }

        return totalHours <= hours;
    }



    public static void main(String[] args) {
        int[] piles ={3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));

    }
}
