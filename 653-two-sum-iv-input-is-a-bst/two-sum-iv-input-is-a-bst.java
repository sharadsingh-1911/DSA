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
    //global answer list
    ArrayList<Integer> answer  = new ArrayList<>();

    //inorder fxn
    private ArrayList<Integer> inorder(TreeNode root){
        
        if(root == null){
            return null;
        }
        inorder(root.left);
        answer.add(root.val);
        inorder(root.right);
        return answer;
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> sortedNodes = inorder(root);
        int i =0;
        int j =sortedNodes.size()-  1 ;
        while(i<j){
            
            if(sortedNodes.get(i) + sortedNodes.get(j)==k){
                return true;
            }else if(sortedNodes.get(i) + sortedNodes.get(j) < k){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}