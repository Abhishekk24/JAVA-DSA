
import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {
        static int idx = -1;

        public static Node binarytree(int node[]) {
            idx++;

            if (idx >= node.length || node[idx] == -1) {
                return null;
            }

            Node newnode = new Node(node[idx]);
            newnode.left = binarytree(node);
            newnode.right = binarytree(node);

            return newnode;
        }
    }

    public static void LevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            if (root == null) {
                return;
            }
            Node currentNode = q.remove();
            if (currentNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }

    }

    public static int CountNodes(Node root, int target) {
        if (root == null) {
            return 0;
        }

        int LeftCount = CountNodes(root.left, target);
        int RightCount = CountNodes(root.right, target);
        int sum = LeftCount + RightCount + root.data;

        if (sum == target) {
            return 1 + LeftCount + RightCount;
        } else {
            return LeftCount + RightCount;
        }
    }

    public static int HeightofTree(Node root) {
        if (root == null) {
            return 0;
        }

        int LeftHeight = HeightofTree(root.left);
        int RightHeight = HeightofTree(root.right);

        int Height = Math.max(LeftHeight, RightHeight) + 1;

        return Height;
    }

    // Time complexity of this function is N^2
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = HeightofTree(root.left) + HeightofTree(root.right) + 1;

        return Math.max(dia3, Math.max(dia2, dia3));
    }

    static class Treeinfo {
        int height;
        int diameter;

        Treeinfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static Treeinfo TreeDiamter(Node root) {
        if (root == null) {
            return new Treeinfo(0, 0);
        }
        Treeinfo left = TreeDiamter(root.left);
        Treeinfo right = TreeDiamter(root.right);

        int newHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int newdiam = Math.max(Math.max(diam1, diam2), diam3);

        Treeinfo info = new Treeinfo(newHeight, diam3);

        return info;
    }

    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.binarytree(node);

        // System.out.println(root.data);

        LevelOrder(root);

        System.out.println(CountNodes(root,7));

        // System.out.println(HeightofTree(root));

        // System.out.println(diameter(root));

        // System.out.println(TreeDiamter(root).diameter);
    }
}
