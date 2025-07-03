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
    public static void Traversal(TreeNode root,int n, List<List<Integer>> t){
        if(root==null) return;
        if(t.size()==n){
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            t.add(l);
        }
        else{
            t.get(n).add(root.val);
        }
        Traversal(root.left,n+1,t);
        Traversal(root.right,n+1,t);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Traversal(root,0,res);
        return res;
    }
}