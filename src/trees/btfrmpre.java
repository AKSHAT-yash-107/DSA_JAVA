package trees;

public class btfrmpre {


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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n = preorder.length;
            return helper (preorder, inorder, 0,n-1,0,n-1);

        }
    }
}
