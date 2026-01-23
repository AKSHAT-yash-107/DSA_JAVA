package trees;

import java.util.Arrays;

public class cnstructbstfrompre {

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
        public TreeNode helper(int[] preorder,int[] inorder , int pl,int ph,int il,int ih){
            if(il>ih || pl>ph ) return null;
            TreeNode root = new TreeNode(preorder[pl]);
            int r =0;

            while(inorder[r]!=preorder[pl]) r++;
            int leftsize=r-il;
            root.left= helper(preorder,inorder,pl+1,pl+leftsize,il,r-1);
            root.right=helper(preorder,inorder,pl+leftsize+1,ph,r+1,ih);
            return root;

        }
        public TreeNode bstFromPreorder(int[] preorder) {
            int n = preorder.length;
            int[] inorder= Arrays.copyOf(preorder,n);
            Arrays.sort(inorder);
            return helper (preorder, inorder, 0,n-1,0,n-1);

        }
    }

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
    class Solution2 {
        public TreeNode bstFromPreorder(int[] preorder) {
            TreeNode root=new TreeNode(preorder[0]);
            for(int i=1;i<preorder.length;i++){
                insert(root,preorder[i]);
            }
            return root;
        }
        public TreeNode insert(TreeNode root,int val){
            if(root==null){
                return new TreeNode(val);
            }
            if(root.val>val){
                root.left=insert(root.left,val);
            }
            else{
                root.right=insert(root.right,val);
            }
            return root;
        }
    }
}
