public class Solution {
    public TreeNode invertTree(TreeNode root) {
        // nothing to invert
        if (root == null) {
            return root;
        }

        // traverse left side
        TreeNode left = invertTree(root.left);

        // traverse right side
        TreeNode right = invertTree(root.right);

        // swap
        root.right = left;
        root.left = right;

        // return
        return root;
    }
}
