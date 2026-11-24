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
    public int maxDepth(TreeNode root) {

    if(root == null){
        return 0;
    }    

    return fd(root);
    
    }

    public int fd (TreeNode root){

        if(root.left == null && root.right == null){
            return 1;
        }

        int left = Integer.MIN_VALUE;

        if(root.left !=null){
            left = 1+fd(root.left);
        }

        int right = Integer.MIN_VALUE;

        if(root.right !=null){
            right = 1+fd(root.right);
        }

        return Math.max(left,right);
    }
}