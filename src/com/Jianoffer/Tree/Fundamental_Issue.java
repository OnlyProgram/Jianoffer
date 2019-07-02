package com.Jianoffer.Tree;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
/*
本部分实现树的基本知识，如遍历(非递归)等
 */
public class Fundamental_Issue {
    void PreOrder(TreeNode root){
        if(root==null){
            System.out.println("The tree is Empty!");
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(root!=null || !st.empty()){
            while(root!=null){
                System.out.print(root.value+"->");
                st.push(root);
                root = root.left;
            }
            if(!st.empty()){
                root = st.pop();
                root = root.right;
            }
        }
        System.out.println("null");
    }
    void InOrder(TreeNode root){
        if(root==null){
            System.out.println("The tree is Empty!");
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(root!=null || !st.empty()){
            while(root!=null){

                st.push(root);
                root = root.left;
            }
            if(!st.empty()){
                root = st.pop();
                System.out.print(root.value+"->");
                root = root.right;
            }
        }
        System.out.println("null");
    }
    void PostOrder(TreeNode root){
        if(root==null){
            System.out.println("The tree is Empty!");
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<Integer> s2 = new Stack<Integer>();
        Integer i = new Integer(1);
        while(root != null || !s.empty()){
            while (root != null) {  //直到最左叶子节点
                s.push(root);
                s2.push(new Integer(0));//标记是否查找该节点的右子树
                root = root.left;
            }
            while (!s.empty() && s2.peek().equals(i)) {  //栈不为空，且没有遍历
                s2.pop();
                System.out.print(s.pop().value+"->");
            }
            if (!s.empty()) {
                s2.pop();
                s2.push(new Integer(1));//标记该节点的右子树已经查询
                root = s.peek();
                root = root.right;
            }
        }
        System.out.println("null");
    }
    void LevelOrder(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
        queue.add(root);
        while(queue.size() != 0)
        {
            int len = queue.size();
            for(int i=0;i <len; i++)
            {
                TreeNode temp = queue.poll();
                System.out.print(temp.value+"->");
                if(temp.left != null)  queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
        System.out.println("null");
    }
}
