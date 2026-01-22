package trees;
import java.util.*;
public class kthsmallest {


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
        public List <TreeNode> helper (TreeNode root ){
            List<TreeNode> list = new LinkedList<>();
            if(root == null ) return list;

            helper(root.left);
            list.add(root);
            helper(root.right);
            return list;


        }
        public int kthSmallest(TreeNode root, int k) {
            List<TreeNode> list = helper(root);
            return list.get(k).val;




        }
    }
}
