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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        //if empty tree
        if(root == null){
            return ans;
        }

        //Level order (BFS) techniques require Queue 
        Queue<TreeNode> q = new LinkedList<>();
        
        // Push root element into queue to begin traversal with
        q.offer(root);

        //process until q becomes empty or no nodes remain there 

        while(!q.isEmpty()){
            //we want to process exactly one levl at a time and store element of that level in a list
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i =0 ; i<size ; i++){
                TreeNode node = q.poll();
                level.add(node.val);

                //adding children of popped elements in level order so that they can be processed in next iteration

                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }

            }
            // each new level will get added at first index i.e the previous ones already in ans
            ans.addFirst(level);
        }
        return ans;
    }
}