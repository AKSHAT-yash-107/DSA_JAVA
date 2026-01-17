package trees;
import java.util.*;
public class practice {
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

      public int height(TreeNode root){
          if (root == null) return 0;
          return 1+Math.max(height(root.left),height(root.right));
      }
      boolean balanced (TreeNode root ){
          if (root ==  null) return true;
          int h1 = height(root.left);
          int h2 = height (root.right);
          if(Math.max(h1,h2)-Math.min(h1,h2)>1) return false;
          return balanced(root.left) && balanced(root.right);

      }
         public boolean isSameTree(TreeNode p, TreeNode q){
          if(p==null && q== null) return true;
          if(p==null &&q!=null || q==null && p!=null) return false;
          if(p.val==q.val )return true ;
          return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
         }
         public TreeNode invertTree(TreeNode root){
          if (root == null ) return root;
          TreeNode temp = root.left;
          root.left= root.right;
          root.right = temp;
          invertTree(root.left);
          invertTree(root.right);
          return root;
         }
         public TreeNode LEVELinvertTree(TreeNode root)
         {
                Queue<TreeNode> q= new LinkedList<>();
                q.add(root);
                while(!q.isEmpty()){
                    TreeNode temp = q.poll();
                    TreeNode swap = temp.left;
                    temp.left= temp.right;
                    temp.right=swap;
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);


                }
                return root;
         }


         public void addLeft(TreeNode root, List<Integer> res){
             if(root == null ) return ;

            if(root.left!=null){
                res.add(root.val);
                addLeft(root.left,res);
            }

          else if(root.right!=null) {
              res.add(root.val);
              addLeft(root.right, res);
          }

         }
         public void addleaf(TreeNode root, List<Integer> res){
          if(root == null) return ;

          if(root.left== null && root.right == null ) {
              res.add(root.val);
              return;
          }
          addleaf(root.left,res);
          addleaf(root.right,res);
         }

         public void addright(TreeNode root,  List<Integer> res){
          if(root == null ) return;
          if(root.right!=null ) {addright(root.right,res); res.add(root.val);}
          else if(root.left!=null) {addright(root.left,res); res.add(root.val);}

         }
         public List<Integer> boundary(TreeNode root){

          List<Integer> res = new ArrayList<>();
          if(root== null) return res;
             res.add(root.val);

             // left boundary
             addLeft(root.left, res);

             // leaves
             addleaf(root.left, res);
             addleaf(root.right, res);

             // right boundary
             addright(root.right, res);
          return res;
         }
  }
}
