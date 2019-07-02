package com.Jianoffer.list;
/*
description：给定一个排序的列表，删除重复的节点

 */
public class offer18_Delte_repeatNode {
    public ListNode DelDuplication(ListNode head){
        if(head==null){
            return head;
        }
        ListNode Pnext = head;
        ListNode PreNode = head;
        while (Pnext.next!=null){
            if(Pnext.val==Pnext.next.val){
                if(Pnext.next.next!=null){
                    Pnext = Pnext.next.next;
                    PreNode.next = Pnext;
                }
                else{
                    Pnext.next = null;
                    PreNode.next = null;
                }
            }
            else{
                Pnext = Pnext.next;
                PreNode.next = Pnext;
            }
            PreNode = PreNode.next;
        }
        return head;
    }
}
