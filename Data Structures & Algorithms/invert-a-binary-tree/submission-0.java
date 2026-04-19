/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        return switching(root);
    }

    public TreeNode switching(TreeNode curr) {
        if (curr == null) {
            return null;
        }
        TreeNode left = curr.left;
        curr.left = curr.right;
        curr.right = left;

        switching(curr.left);
        switching(curr.right);

        return curr;
        

    }
}
