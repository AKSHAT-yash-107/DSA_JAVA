package trees;

public class delete {


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
        public  TreeNode inorder_pred(TreeNode root){
            TreeNode pred = root.left;
            while(root.right!=null){
                pred= root.right;
            }
            return pred;
        }


        public  TreeNode parent (TreeNode root,TreeNode pred){
         if(root.left==pred || root.right==pred) return root;//
         TreeNode temp = root.left;
                while(temp.right!=pred) temp =temp.right;
                return temp;
        }




        public TreeNode deleteNode(TreeNode root, int key) {
                if (root== null) return null;
            if(root.val==key ){
                // leaf node hai to direct return null
                if(root.left== null && root.right==null ) return null;

                //single child
                // jo bhi uski next node exist krti hai usko return
                if(root.left==null || root.right== null){
                    if (root.left==null) return root.right;
                    else return root.left;
                }
                // double child -> we find inorder predecessor as pred and find its parent as well
                // replace the node to be deleted wit h pred and update pred parent
                else{
                    TreeNode pred = inorder_pred(root);
                    TreeNode pred_p= parent (root,pred);
                    if(root==pred_p){
                        pred.right = root.right;
                        return pred;
                    }
                    pred_p=pred.left;
                    pred.left=root.left;
                    pred.right=root.right;
                    return pred;
                }

            }
            if(root.val>key){
                root.left=deleteNode(root.left,key);

            }
            if(root.val<key){
                root.right=deleteNode(root.right,key);
            }
            return root;
        }
    }
}
