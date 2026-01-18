package trees;

public class rangesumbst {

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
           public int rangeSumBST(TreeNode root, int low, int high) {
            if(root == null) return 0;
            int sum=  rangeSumBST(root.left,low,high)+rangeSumBST(root.left,low,high);
            if(root.val<high &&  root.val>low) sum+=root.val;
            return sum;




    }
}
