package trees;

public class inorderpredecessor {




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



    public TreeNode inorder_pred(TreeNode root){
        TreeNode pred = root.left;
        while(root.right!=null){
            pred= root.right;
        }
        return pred;
    }

    public TreeNode inorder_succ(TreeNode root){
        TreeNode succ = root.right;
        while(root.left!=null){
            succ= root.left;
        }
        return succ;
    }


    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {

        return root;}
    }
}
