package trees;

public class maxinbst {
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

        public int max(TreeNode root ){
        if(root == null) return 0;
        int a = root.val;int b=max(root.left);int c = max(root.right);
        return Math.max(a,Math.max(b,c));
        }
        public int min(TreeNode root ){
            if(root == null) return 0;
            int a = root.val;int b=min(root.left);int c = min(root.right);
            return Math.min(a,Math.min(b,c));
        }
    }
}
