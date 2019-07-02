package com.Jianoffer.Tree;
import java.util.Queue;
import java.util.LinkedList;
/*
设计一个函数输入一个二叉树，输出二叉树的镜像
遍历节点，如果该节点有子节点，交换其子节点
 */
public class offer_27_BTMirror {
    public void Mirror(TreeNode root){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }
    }
    void MirrorNoRecursive(TreeNode root){
        if(root==null){
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size() != 0)
        {
            int len = queue.size();
            for(int i=0;i <len; i++)
            {
                TreeNode temp = queue.poll();
                TreeNode temp2 = temp.left;
                temp.left = temp.right;
                temp.right = temp2;
                if(temp.left != null)  queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
    }
}
