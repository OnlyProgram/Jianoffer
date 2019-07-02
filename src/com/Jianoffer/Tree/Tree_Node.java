package com.Jianoffer.Tree;

public class Tree_Node {
    //含有指向父节点的指针
    public int value;
    public Tree_Node left;
    public Tree_Node right;
    public Tree_Node father;
    public Tree_Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
        this.father = null;
    }
}
