package trees;

public class btfrrompostandin {


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
        public TreeNode helper(int[]postorder , int[]inorder, int pl,int ph,int il, int ih ){
            if(il>ih || pl>ph ) return  null;
            TreeNode root = new TreeNode(postorder[ph]);
            int r =0;
            while(r<=ih && inorder[r]!=postorder[ph]) r++;
            int rightsize=ih-r;
            root.right=helper(postorder,inorder,ph-rightsize,ph-1,r+1,ih);
            root.left=helper(postorder,inorder,pl,ph-rightsize-1,il,r-1);
            return root;

        }
        public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        return helper(postorder,inorder,0,n-1,0,n-1);
        }
    }
}
