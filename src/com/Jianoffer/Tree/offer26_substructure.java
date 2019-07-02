package com.Jianoffer.Tree;
/*
输入两棵二叉树A,B，判断B是否为A的子结构
 */
public class offer26_substructure {
    public boolean IsSubStructure(TreeNode father,TreeNode sub){

        boolean result = false;
        if(father!=null&&sub!=null){
            if(father.value==sub.value){
                result = HaveSub(father,sub);
            }
            if(!result){
                result = IsSubStructure(father.left,sub);
            }
            if(!result){
                result = IsSubStructure(father.right,sub);
            }
        }
        return false;
    }
    boolean HaveSub(TreeNode father,TreeNode sub){
        if(sub==null){
            return true;
        }
        if(father==null){
            return false;
        }
        if(father.value!=sub.value){
            return false;
        }
        return HaveSub(father.left,sub.left)&&HaveSub(father.right,sub.right);
    }
}
