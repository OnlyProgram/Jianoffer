package com.Jianoffer.list;


/**
 * 求两个链表的第一个公共节点
 * 思路一：暴力解法
 * 思路二：求两个链表长度，比较长的先遍历，然后一起遍历，第一次相遇则就是第一个公共节点
 */
public class offer_37_FirstCommonNode {
    public ListNode FindFirstCommNode(ListNode node1,ListNode node2)
    {
        ListNode current1 = node1;
        ListNode current2 = node2;
        if(node1==null || node2==null){return null;}
        int len1 = getlistnodelen(current1);
        int len2 = getlistnodelen(current2);
        if(len1>=len2){
            int len = len1 - len2;
            while(len>0){
                current1 = current1.next;
                len--;
            }
        }
        if(len1 < len2){
            int len = len2 - len1;
            while(len>0){
                current2 = current2.next;
                len--;
            }
        }
        //开始一起遍历
        while(current1!=current2){
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1;
    }
    private int getlistnodelen(ListNode head){
        int len = 0;
        ListNode cur = head;
        while(cur!=null){
            len++;
            cur = cur.next;
        }
        return len;
    }
}
