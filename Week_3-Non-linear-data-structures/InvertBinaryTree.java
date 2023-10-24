public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode invert = invertTree(root);
        invert.printLevelOrder(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.right);
        invertTree(root.left);
        return root;
    }

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
        void printCurrentLevel(TreeNode root, int level) {
            if (root == null)
                return;
            if (level == 1)
                System.out.print(root.val + " ");
            else if (level > 1) {
                printCurrentLevel(root.left, level - 1);
                printCurrentLevel(root.right, level - 1);
            }
        }
        void printLevelOrder(TreeNode root)
        {
            for (int i = 1; i <= 3; i++)
                printCurrentLevel(root, i);
        }
    }
}