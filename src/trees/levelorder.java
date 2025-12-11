package trees;
import java.util.*;
    public class levelorder {
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
            public List<List<Integer>> levelOrder(TreeNode root) {

                List<List<Integer>> result= new ArrayList<>();
                if(root==null) return result;
                Queue<TreeNode> q = new LinkedList<>();
                q.add(root);
                while(!q.isEmpty()){
                    int currentlevelsize=q.size();
                    List<Integer> levelmembers=  new ArrayList<>();
                    for (int i = 0; i < currentlevelsize; i++) {
                        TreeNode temp= q.poll();
                        levelmembers.add(temp.val);
                    if (temp.left!=null) q.add(temp.left);
                    if (temp.right!=null) q.add(temp.right);
                    }
                    result.add(levelmembers);
                }
                return result;
            }

