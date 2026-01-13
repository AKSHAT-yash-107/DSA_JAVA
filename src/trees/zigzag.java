package trees;
import java.util.*;

public class zigzag {


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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            if (root == null ) return result;
            Queue<TreeNode> q= new LinkedList<>();
            q.add(root);
            boolean odd= true;

            while(!q.isEmpty()){
                int size= q.size();
                List<Integer> level = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = q.poll();
                    level.add(temp.val);

                    if(temp.left!= null) q.add(temp.left);
                    if(temp.right!= null) q.add(temp.right);
                }

                if(!odd) Collections.reverse(level);
                result.add(level);
                odd=!odd;
            }

            return result;
        }
    }


}
