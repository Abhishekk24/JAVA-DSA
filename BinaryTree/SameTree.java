import java.util.*;
public class SameTree {
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
    static boolean check(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p != null && q != null) {
            if (p.val == q.val) {
                return check(p.left,q.left) && check(p.right,q.right);
            }
            }
            return false;
    }
         public static void main(String[] args) {
            TreeNode p = new TreeNode(1);
            TreeNode q = new TreeNode(1);
            p.left = new TreeNode(2);
            q.left = new TreeNode(2);
            p.right = new TreeNode(3);
            q.right = new TreeNode(3);

            System.out.println(check(p, q));
         }
}
