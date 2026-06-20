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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // base condn if no tree exists
       if(root == null){
        return false;
       }
       
       // check if current node is leaf node (no children) also check if current node.val is equal to remaining targetSum
       if(root.left == null && root.right == null){
        return root.val == targetSum;
       }

       return hasPathSum(root.left , targetSum-root.val) || hasPathSum(root.right , targetSum - root.val);
    }
}