package trees;
import java.util.*;

public class treepath {
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
    public void helper(TreeNode root, List<String>s){
        if(root == null) return;
        s.add(String.valueOf(root.val));
        helper(root.left,s);
        helper (root.right,s);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> s = new LinkedList<>();
        if(root == null) return s;
        s.add(String.valueOf(root.val));
        helper(root.left,s);
        helper(root.right,s);

        return s;

    }
    class Solution {

        public void helper(TreeNode root, String path, List<String> res) {
            if (root == null) return;

            // add current node to path
            path = path + root.val;

            // if leaf → complete path
            if (root.left == null && root.right == null) {
                res.add(path);
                return;
            }

            // recurse with updated path
            helper(root.left, path + "->", res);
            helper(root.right, path + "->", res);
        }

        public List<String> binaryTreePaths(TreeNode root) {
            List<String> res = new ArrayList<>();
            if (root == null) return res;

            helper(root, "", res);
            return res;
        }
    }

}
