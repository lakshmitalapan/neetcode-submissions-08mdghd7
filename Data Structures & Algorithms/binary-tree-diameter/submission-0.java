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
    public int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        maxHeight(root);
        return max;
    }

    public int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int right = maxHeight(root.right);
        int left = maxHeight(root.left);
        max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
    }
}
