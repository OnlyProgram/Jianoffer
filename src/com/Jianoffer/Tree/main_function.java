package com.Jianoffer.Tree;

public class main_function {

    public static void main(String[] args) {
        /*
        //测试创建二叉树
        int[] pre ={1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        offer7_Reconstruct_binary_tree recons = new offer7_Reconstruct_binary_tree();
        TreeNode root = recons.recnstructBinaryTree(pre,in);
        PreOrder(root);
         */

        Tree_Node root = new Tree_Node(2);
        offer8_next_treeNode next = new offer8_next_treeNode();
        System.out.println(next.Solution(root));
        Fundamental_Issue fun = new Fundamental_Issue();
        TreeNode treenode1 = new TreeNode('A');
        TreeNode treenode2 = new TreeNode('B');
        TreeNode treenode3 = new TreeNode('C');
        TreeNode treenode4 = new TreeNode('D');
        TreeNode treenode5 = new TreeNode('E');
        TreeNode treenode6 = new TreeNode('F');
        TreeNode treenode7 = new TreeNode('G');
        treenode1.left = treenode2;
        treenode1.right = treenode3;
        treenode2.left = treenode4;
        treenode2.right = treenode6;
        treenode4.right = treenode5;
        treenode6.left = treenode7;
        fun.PreOrder(treenode1);
        fun.InOrder(treenode1);
        fun.PostOrder(treenode1);
        offer_27_BTMirror mir = new offer_27_BTMirror();
        offer28_symmetryBT sy = new offer28_symmetryBT();
        System.out.println(sy.Symmetry(treenode1));
        mir.MirrorNoRecursive(treenode1);
        fun.LevelOrder(treenode1);
    }
    public static  void PreOrder(TreeNode root){
        if (root!= null){
            System.out.print(root.value + "->");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

}
