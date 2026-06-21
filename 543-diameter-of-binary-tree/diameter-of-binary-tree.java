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
    int result = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        dfsPath(root);
        return result;
    }
    private int dfsPath(TreeNode root){
        if(root == null){
            return 0 ;
        }
        int left = dfsPath(root.left);
        int right = dfsPath(root.right);
        int sum = left + right ;
        result = Math.max(result , sum);
        return 1+Math.max(left,right);
    }
}