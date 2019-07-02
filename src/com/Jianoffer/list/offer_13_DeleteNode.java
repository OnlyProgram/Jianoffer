package com.Jianoffer.list;

public class offer_13_DeleteNode {
    /**
     *
     * @param head 头结点
     * @param deletenode 待删除节点
     * @return
     */
    public ListNode deleteNode(ListNode head,ListNode deletenode){

        if(head == null || deletenode==null){
            return head;
        }
        //删除的是头结点
        if(head==deletenode){
            return deletenode.next;
        }
        //删除的是尾结点，需找到前驱节点
        if(deletenode.next==null){
            ListNode temp = head;
            while(temp.next!=deletenode){
                temp = temp.next;
            }
            temp.next = null;
        }
        else{
            deletenode.val = deletenode.next.val;
            deletenode.next = deletenode.next.next;
        }
        return head;
    }
}
