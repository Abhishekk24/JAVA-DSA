import java.util.*;

public class IterativePreorderTraversal {
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

    static List<Integer> preorder(TreeNode root){
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);

        if(root == null){
            return list;
        }

        while(!st.isEmpty()){
            root = st.pop();
            list.add(root.val);

            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(3);
        node.right = new TreeNode(6);
        node.left.right = new TreeNode(10);

        System.out.println(preorder(node));
    }
}