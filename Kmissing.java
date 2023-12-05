import java.util.ArrayList;

import java.util.List;

class Kmissing {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6 };
        System.out.println(miss(arr, 5));
    }

    static int miss(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                list.add(i);
            }
        }

        if (k < list.size()) {
            return list.get(k);
        } else {
            return -1;
        }
    }
}
