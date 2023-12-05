import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int [3][3];

        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         arr[row][col] = sc.nextInt();

        //     }

        // }
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + "");
        //     }
        //     System.out.println();
        // }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3 ; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3 ; j++){
                list.get(i).add(sc.nextInt());
            }}
            System.out.println(list);
    }

    public static int[] copyOfRange(int[] arr, int i, int mid) {
        return null;
    }

    public static char[] toString(int[] arr) {
        return null;
    }
}