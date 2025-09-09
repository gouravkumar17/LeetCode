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
    private void check(TreeNode r){
        if(r==null) return;
        TreeNode t = r.left;
        r.left = r.right;
        r.right = t;
        check(r.left);
        check(r.right);
    }
    public TreeNode invertTree(TreeNode root) {
        check(root);
        return root;
    }
}