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
    public TreeNode recoverFromPreorder(String traversal) {
        List<TreeNode> l = new ArrayList<>();
        int i=0;
        int n=traversal.length();
        while(i<n){
            int d=0;
            while(i<n && traversal.charAt(i)=='-'){
                d++;
                i++;
            }
            int v=0;
            while(i<n && Character.isDigit(traversal.charAt(i))){
                v = v*10+(traversal.charAt(i)-'0');
                i++;
            }
            TreeNode node = new TreeNode(v);
            if(d<l.size()) l.set(d,node);
            else l.add(node);
            if(d>0){
                TreeNode p = l.get(d-1);
                if(p.left==null) p.left=node;
                else p.right=node;
            }
        }
        return l.get(0);
    }
}