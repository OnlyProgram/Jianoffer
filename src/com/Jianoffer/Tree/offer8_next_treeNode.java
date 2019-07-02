package com.Jianoffer.Tree;

/**
 * 给定一棵二叉树和其中一个节点，找出中序遍历的其中一个节点，树中节点不仅包含指向左右子树的指针，还有一个指向父节点的指针
 *
 * 思路：如果一个节点有右子树，则下一节点为右子树的最左子节点；
 *      如果一个节点没有右子树，且是左子节点，则下一节点是其父节点；
 *      如果一个节点没有右子树，且是父节点的右子节点，则要沿着其父节点向上遍历，直到一个是它父节点的左子节点的节点，
 *      没有找到则无下一个节点
 */
public class offer8_next_treeNode {
    public Tree_Node Solution(Tree_Node node){
        if (node==null){
            return null;
        }
        if (node.right != null){
            node = node.right;
            while(node!=null){
                node = node.left;
            }
            return node;
        }
        else{
            while(node.father!=null){ //父节点不为空，如果为空，则代表到达根节点
                if(node.father.left!=node){   //如果该节点的父节点的左子节点为该节点本身，则其父节点为下一节点
                    return node.father;
                }
                node = node.father;
            }
        }
        return null;
    }
}
