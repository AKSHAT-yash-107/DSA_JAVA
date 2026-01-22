package trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class validatebst {


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
        public void inorder(TreeNode root, LinkedList<TreeNode>list){
         if(root == null )return;
         inorder(root.left,list);
         list.push(root);
         inorder(root.right,list);

        }

        public boolean isValidBST(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        inorder(root,list);
        for (int i =1 ;i< list.size();i++){
            if(list.get(i).val<=list.get(i-1).val) return false ;
        }
        return true;
        }

        Integer prev = null;

        public boolean isValidBSTbetter(TreeNode root) {
            if (root == null) return true;

            if (!isValidBSTbetter(root.left)) return false;

            if (prev != null && root.val <= prev) return false;
            prev = root.val;

            return isValidBSTbetter(root.right);
        }
    }



