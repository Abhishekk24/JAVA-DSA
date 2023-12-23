import java.util.*;

public class IterativeInorderTraversal {
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

    static List<Integer> inorder(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;

        while (true) {

            if (node != null) {
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                inorder.add(node.val);
                node = node.right;
            }
        }
        return inorder;
    }

    public static void main(String[] args) {
        TreeNode node =  new TreeNode(1);
        node.right = new TreeNode(2);
        node.left = new TreeNode(5);
        node.left.right = new TreeNode(3);
        node.right.left = new TreeNode(10);

        System.out.println(inorder(node));
    }
}
