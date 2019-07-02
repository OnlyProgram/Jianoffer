package com.Jianoffer.Tree;

public class offer7_Reconstruct_binary_tree {
    public TreeNode recnstructBinaryTree(int []pre,int []in){
        /*
        pre: 前序序列
        in:中序序列
         */
        if (pre==null || in==null){
            return null;
        }
        else{
            return reconBTree(pre,0,pre.length-1,in,0,in.length-1);
        }
    }

    public TreeNode reconBTree(int [] pre,int preleft,int preright,int [] in,int inleft,int inright){
        if(preleft > preright||inleft >inright){
            return null;
        }
        TreeNode root = new TreeNode(pre[preleft]);
        //对中序数组进行输入边界遍历
        for(int i = inleft;i<=inright;i++){  //找到前序中与中序相同的节点
            if(pre[preleft]==in[i]){
                //重构左子树，前序长度为中序i之前的长度，中序长度为i-1
                root.left = reconBTree(pre,preleft+1,preleft+i-inleft,in,inleft,i-1);
                root.right = reconBTree(pre,preleft+i-inleft+1,preright,in,i+1,inright);
            }
        }
        return root;
    }
}
