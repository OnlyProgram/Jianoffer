package com.Jianoffer.list;

/**
 * 剑指offer练习题  反转列表
 */
public class offer24_ReverseList {
    public ListNode ReverseList(ListNode head){
        ListNode ReverseHead = null;
        ListNode Node = head;
        ListNode PreNode = null;
        if(head==null){return null;}
        while (Node!=null){
            //先用Nodenext保存head的下一个节点的信息，保证单链表不不会因为失去head节点的原next节点而就此断裂
            ListNode Nodenext = Node.next;
            //Node 记录反转后的
            if(Nodenext==null){
                ReverseHead = Node;
            }
            //保存完Nodenext，就可以让head从指向next变成指向pre了
            Node.next = PreNode;
            PreNode = Node;
            Node = Nodenext;
        }
        return ReverseHead;
    }
    //递归实现
    public ListNode ReverseList2(ListNode head){

        if(head==null){
            return null;
        }
        if(head.next == null) {
            return head;
        }
        ListNode nextNode = head.next;
        head.next = null;
        ListNode reverse = ReverseList2(nextNode);
        nextNode.next = head;
        return reverse;
    }
}
