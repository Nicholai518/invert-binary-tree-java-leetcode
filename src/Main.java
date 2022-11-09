public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(1, one, three);

        TreeNode six = new TreeNode(6);
        TreeNode nine = new TreeNode(9);
        TreeNode seven = new TreeNode(7, six, nine);

        TreeNode root = new TreeNode(4, two, seven);

        TreeNode exampleOne = solution.invertTree(root);

        printTree(exampleOne);
    }

    public static TreeNode printTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            System.out.print(root.val + " ");
            printTree(root.left);
            printTree(root.right);
        }
        return null;
    }
}
