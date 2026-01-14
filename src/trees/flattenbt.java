package trees;
import java.util.*;
public class flattenbt {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public void flatten(TreeNode root) {

            TreeNode curr = root;

            while (curr != null) {

                if (curr.left != null) {

                    // step 2: find rightmost of left subtree
                    TreeNode prev = curr.left;
                    while (prev.right != null) {
                        prev = prev.right;
                    }

                    // step 3: attach original right
                    prev.right = curr.right;

                    // step 4 & 5
                    curr.right = curr.left;
                    curr.left = null;
                }

                // step 6
                curr = curr.right;
            }
        }
    }



    class Solution {
        public void flatten(TreeNode root) {

            TreeNode curr = root;

            while (curr != null) {

                if (curr.left != null) {

                    // step 2: find rightmost of left subtree
                    TreeNode prev = curr.left;
                    while (prev.right != null) {
                        prev = prev.right;
                    }

                    // step 3: attach original right
                    prev.right = curr.right;

                    // step 4 & 5
                    curr.right = curr.left;
                    curr.left = null;
                }

                // step 6
                curr = curr.right;
            }
        }
    }



    class Solution {
        public void flatten(TreeNode root) {

            TreeNode curr = root;

            while (curr != null) {

                if (curr.left != null) {

                    // step 2: find rightmost of left subtree
                    TreeNode prev = curr.left;
                    while (prev.right != null) {
                        prev = prev.right;
                    }

                    // step 3: attach original right
                    prev.right = curr.right;

                    // step 4 & 5
                    curr.right = curr.left;
                    curr.left = null;
                }

                // step 6
                curr = curr.right;
            }
        }
    }


}
