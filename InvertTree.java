public class InvertTree {

    /**
     * 翻转一棵二叉树
     * @param root
     * @return https://leetcode-cn.com/problems/invert-binary-tree/description/
     */

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {

    }
}
