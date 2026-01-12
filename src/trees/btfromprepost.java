package trees;

import com.sun.source.tree.Tree;

public class btfromprepost {


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
        public TreeNode helper(int[] preorder, int[] postorder, int prl, int prh, int psl,int psh){
            if(prl> prh || psl>psh ) return null;
            TreeNode root= new TreeNode(postorder[psh]);
            if (prl == prh) return root;
            int l =psl;
            while (l<=psh && postorder[l]!=preorder[prl+1]) l++;
            int leftsize=l-psl+1;
            root.left= helper(preorder,postorder,prl+1,prl+leftsize,psl,l);
            root.right= helper(preorder,postorder,prl+leftsize+1,prh,l+1,psh-1);
            return root;
        }
        public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
            int n= preorder.length;
            return helper(preorder,postorder,0,n-1,0,n-1);

        }
    }

}
