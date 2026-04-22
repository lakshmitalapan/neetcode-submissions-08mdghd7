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
    List<List<Integer>> answers = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        calc(root, 0);
        return answers;
    }

    public void calc(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (answers.size() == level) {
            answers.add(new ArrayList<>());
        }
        answers.get(level).add(root.val);
        calc(root.left, level + 1);
        calc(root.right, level + 1);
    }
}
