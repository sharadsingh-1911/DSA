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
    List<List<Integer>>answer = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root , targetSum , new ArrayList<>());
        return answer;
    }
    private void dfs(TreeNode root , int targetSum , ArrayList<Integer> path){
        //base case
        if(root == null){
            return;
        }
        // add node value in path
        path.add(root.val);

        // check for root node 
        if(root.left == null && root.right == null){
            if(root.val == targetSum){
                answer.add(new ArrayList<>(path)); 
           }
        }
                
// why dont we use answer.add(path) directly ?        
                
//Think of path as a whiteboard.

//ans.add(path) stores a reference to the whiteboard.
//ans.add(new ArrayList<>(path)) stores a photograph of the whiteboard.

//Later, when you erase the whiteboard (backtracking), the photograph still contains the old contents.

//That's why in backtracking problems like Path Sum II, Subsets, Permutations, Combination Sum, you'll almost always see:
 

        //recursive calls for finding targetSum - root.val

        dfs(root.left, targetSum - root.val, path);
        dfs(root.right, targetSum - root.val, path);

        // backtrack
        path.remove(path.size()-1);

    }
}