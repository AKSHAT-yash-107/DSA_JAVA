package trees;

import java.util.ArrayList;
import java.util.List;

public class bst_to_gst {


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

        public void inorder(TreeNode root, List<TreeNode> arr){
            if(root==null ) return;
            inorder(root.left,arr);
            arr.add(root);
            inorder(root.right,arr);

        }



        public TreeNode bstToGst(TreeNode root) {
            List<TreeNode> arr= new ArrayList<>();
            inorder(root,arr);
            for(int i = arr.size()-2;i>=0;i--){
                arr.get(i).val +=arr.get(i+1).val;
            }
            return root;
        }
    }


    class Solution2 {
        int sum;
        public void reverse_inorder(TreeNode root ){
            if (root == null) return ;
            reverse_inorder(root.right);
            root.val+=sum;
            root.val=sum;
            reverse_inorder(root.left);

         }
        public TreeNode bstToGst(TreeNode root) {
            sum=0;
            reverse_inorder(root);
            return root;
        }
    }
}
