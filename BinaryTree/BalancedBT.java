import java.util.*;

public class BalancedBT {
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
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            return Math.max(lheight, rheight) + 1;
        }
    }

    static boolean isbinary(TreeNode node) {
        if (node == null) return true;
        
        boolean leftBalanced = isbinary(node.left);
        boolean rightBalanced = isbinary(node.right);
        
        if (leftBalanced && rightBalanced) {
            int heightDiff = Math.abs(height(node.left) - height(node.right));
            return heightDiff <= 1;
        }
    
        return false;
    }
    

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left = new TreeNode(5);
        node.left.right = new TreeNode(3);
        node.right.left = new TreeNode(10);

        System.out.println(isbinary(node));
    }
}
