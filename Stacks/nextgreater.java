import java.util.*;

public class nextgreater {

    static int[] findNextGreater(int[] num1, int[] num2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();

        for (int num : num2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] result = new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(num1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = { 1,3,4,2 };

        System.out.println("Next greater elements of the numbers in num1 are:");
        int[] result = findNextGreater(num1, num2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
