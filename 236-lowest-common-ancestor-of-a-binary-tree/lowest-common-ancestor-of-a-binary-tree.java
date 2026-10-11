/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode leftfound = lowestCommonAncestor(root.left,p,q);
        TreeNode rightfound = lowestCommonAncestor(root.right,p,q);

        if(leftfound == null){
            return rightfound;
        }
        if(rightfound == null){
            return leftfound;
        }
        return root;
    }
}