package com.Jianoffer.list;
/*
找出倒数第k个节点
 */
public class offer_22_Find_TailK_node {
    public ListNode FindKthNode(ListNode findnode,int k){
        //传入空指针或者k小于0
        if(findnode==null || k <= 0){
            return null;
        }
        ListNode head = findnode;
        ListNode Behind = findnode;
        for (int i = 1; i < k; i++) {
            //防止k大于总结点数
            if(head.next!=null){
                head = head.next;
            }
            else {
                return null;
            }
        }
        while(head.next != null){
            Behind = Behind.next;
            head = head.next;
        }
        return Behind;
    }
}
