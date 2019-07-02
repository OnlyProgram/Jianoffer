package com.Jianoffer.Tree;
/*
判断二叉树是否对称
 */
public class offer28_symmetryBT {
    boolean Symmetry(TreeNode root){
        return IsSymmetryBT(root,root);
    }
    boolean IsSymmetryBT(TreeNode lroot,TreeNode rroot){
        if(lroot==null && rroot==null){
            return true;
        }
        if(lroot==null || rroot==null){
            return false;
        }
        if(lroot.value!=rroot.value){
            return false;
        }
        return IsSymmetryBT(lroot.left,rroot.right)&&IsSymmetryBT(lroot.right,rroot.left);
    }
}
