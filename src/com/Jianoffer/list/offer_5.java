package com.Jianoffer.list;
import java.util.Stack;
import java.util.ArrayList;
public class offer_5 {
    public ArrayList<Integer> PrintlistFromtail2head(ListNode node){
        Stack<Integer> stack = new Stack<>();
        while(node != null){
            stack.push(node.val);
            node = node.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }
    //递归实现
    public ArrayList<Integer> PrintlistFromtail2head2(ListNode headnode){
        ArrayList<Integer> list = new ArrayList<>();
        if(headnode != null){
           if(headnode.next!=null){
               list = PrintlistFromtail2head2(headnode.next);
           }
            list.add(headnode.val);
        }
        return list;
    }
}
