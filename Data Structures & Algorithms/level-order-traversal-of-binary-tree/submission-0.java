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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List <List<Integer>> res = new ArrayList<>();

        Queue <TreeNode> qe = new LinkedList<TreeNode>();

        if(root == null) return res;

        qe.offer(root);

        while(!qe.isEmpty()){

            int lvl = qe.size();

            List<Integer> add = new LinkedList<Integer>();

            for(int i=0;i<lvl;i++){
                if(qe.peek().left !=null) qe.offer(qe.peek().left);
                if(qe.peek().right !=null) qe.offer(qe.peek().right);
                add.add(qe.poll().val);

            }
            res.add(add);
        }

        return res;
    }
}
