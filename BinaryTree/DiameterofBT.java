import java.util.*;

public class DiameterofBT {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static int height(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static int diameter(TreeNode root) {
        if (root == null)
            return 0;

        // List<Integer> list = new ArrayList<>();

        int lheight = height(root.left);
        int rheight = height(root.right);
        int max = 0;
        max = Math.max(max, lheight + rheight );



        return max;

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left = new TreeNode(5);
        node.left.right = new TreeNode(3);
        node.right.left = new TreeNode(10);


        System.out.println(diameter(node));

    }
}
