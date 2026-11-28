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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        rightView(root,res,0);
        return res;
        
    }
    public void rightView(TreeNode current, List<Integer> res,int curDep){
        if(current == null)return;
      //  List<Integer> res = new ArrayList<>();
        if(res.size()==curDep){
            res.add(current.val);
        }
        rightView(current.right,res,curDep+1);
        rightView(current.left,res,curDep+1);

    }
}
