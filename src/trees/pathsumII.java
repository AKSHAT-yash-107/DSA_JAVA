package trees;

import java.util.ArrayList;
import java.util.List;

public class pathsumII {



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

    class Solution {
        public List<Integer> copy (List<Integer> ans){
            List<Integer> list = new ArrayList<>();
            for(int e: ans ) list.add(e);
            return list;

        }

        public void helper(TreeNode root , int target,  List<Integer> ans, List<List<Integer>> result ){
            if(root == null ) return ;
            if(root.left == null && root.right == null) {
                if (target == root.val){
                    ans.add(root.val);
                    result.add(ans);
                }
                return;
            }
            ans.add(root.val);

            List<Integer> arr1 = copy(ans);
            List<Integer> arr2 =copy(ans);
            helper(root.left,target-root.val,arr1,result);
            helper(root.right,target-root.val, arr2,result);
        }

        public List<List<Integer>> pathSum(TreeNode root, int target) {
            List<Integer> ans = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            helper(root, target, ans ,result);
            return result;
        }
    }
}
