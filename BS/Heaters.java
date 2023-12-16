import java.util.*;

public class Heaters {
    static int radius(int[] houses, int[] heaters) {
        int minRadius = Integer.MIN_VALUE;

        for (int i = 0; i < houses.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < heaters.length; j++) {
                min = Math.min(min, Math.abs(houses[i] - heaters[j]));
            }

            minRadius = Math.max(minRadius, min);
        }

        return minRadius;
    }

    public static void main(String[] args) {
        int[] houses = {1, 2, 3, 4};
        int[] heaters = {1, 4};

        int result = radius(houses, heaters);
        System.out.println("Minimum radius required: " + result);
    }
}
