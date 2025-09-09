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
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left,root.right);
    }
    public boolean isSym(TreeNode l,TreeNode r){
        if(l==null || r==null) return l==r;
        return (l.val==r.val) && isSym(l.left,r.right) && isSym(l.right,r.left);
    }
}