// Time Complexity : o(n*h)
// Space Complexity :  o(n*h) + o(h)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


import java.util.ArrayList;
import java.util.List;

// Your code here along with comments explaining your approach
//Problem1 (https://leetcode.com/problems/path-sum-ii/)
public class problem1 {
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 List<List<Integer>> result ;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

      this.result = new ArrayList<>();

     helper(root, targetSum, 0, new ArrayList<>());
     return result;

    }
    public void helper(TreeNode root, int targetSum, int curr, List<Integer> res) {

    //base case
    if (root == null) return;


    //logic
     List<Integer> path = new ArrayList<>(res);
     curr += root.val;
     path.add(root.val);
     if (root.left == null && root.right == null) {
        if (curr == targetSum) {
            result.add(path);
        }
     }
     helper(root.left, targetSum, curr + root.val, path);
     helper(root.right, targetSum, curr + root.val, path);

    }
}