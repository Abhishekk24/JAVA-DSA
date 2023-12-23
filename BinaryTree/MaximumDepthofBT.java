public class MaximumDepthofBT {
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

    static int maxDepth(TreeNode node){
        if (node == null) return 0;
        else{
            int leftDepth=maxDepth(node.left);
            int rightDepth=maxDepth(node.right);
            return Math.max(leftDepth, rightDepth)+1;
            }
            
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right= new TreeNode(4);
        node.left.left = new TreeNode(10);
        node.left.left.left = new TreeNode(33);
        System.out.println("Max Depth is " + maxDepth(node));
        
    }
    
}
