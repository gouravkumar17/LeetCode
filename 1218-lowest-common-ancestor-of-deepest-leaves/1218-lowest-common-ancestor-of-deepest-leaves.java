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
    TreeNode res;
    int m = -1;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root,0);
        return res;
    }
    private int dfs(TreeNode node, int d){
        if(node==null){
            m = Math.max(m,d);
            return d;
        }
        int l = dfs(node.left,d+1);
        int r = dfs(node.right,d+1);
        if(l==r && l==m) res = node;
        return Math.max(l,r);
    }
}