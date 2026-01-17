package trees;

import java.util.ArrayList;
import java.util.List;

public class boundarytraversal {

    public void addLeft(practice.TreeNode root, List<Integer> res){
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
    public void addleaf(practice.TreeNode root, List<Integer> res){
        if(root == null) return ;

        if(root.left== null && root.right == null ) {
            res.add(root.val);
            return;
        }
        addleaf(root.left,res);
        addleaf(root.right,res);
    }

    public void addright(practice.TreeNode root, List<Integer> res){
        if(root == null ) return;
        if(root.right!=null ) {addright(root.right,res); res.add(root.val);}
        else if(root.left!=null) {addright(root.left,res); res.add(root.val);}

    }
    public List<Integer> boundary(practice.TreeNode root){

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
