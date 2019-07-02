package com.Jianoffer.list;

/**
 * description：给定一个单项列表，并给出头结点和其中一个节点i，需要用O(1)时间去删除该节点
 * 由于为单向列表，所以无法从一个节点直接得到其前驱节点，一般思路为遍历列表，找到i节点的前驱节点，然后该前驱节点next指向i的next，但是时间复杂度为O(n)
 * 如果将i节点的next的值赋给i，然后i的next指向i.next.next,时间复杂度即为O(1)
 */
public class Offer18_DeleteNodeby1 {
    public ListNode delnode(ListNode head,ListNode delnode){
        if(delnode==null||head==null){
            return head;
        }
        if(head==delnode){
            return head.next;
        }
        if(delnode.next==null){
            //删除的为尾结点
            ListNode p = head;
            while(p.next!=delnode){
                p = p.next;
            }
            p.next =null;
        }
        else {
            delnode.val = delnode.next.val;
            delnode.next = delnode.next.next;
        }
        return null;
    }
}
