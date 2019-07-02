package com.Jianoffer.list;


/**
 * 约瑟夫环问题
 * 0、.....，n-1这n个数字排成⼀一个圆圈，从数字0开始每次从这个圆圈⾥删除第m个数字。求出这
 * 个圆圈⾥里里剩下的最后⼀一个数字。
 */
public class offer_45_Circle {
    public int LastNodeval(int m,int n){
        if(m<=-1 ||n<=-1){return -1;}
        //构造循环链表
        ListNode head = new ListNode(0);
        ListNode pre = head;
        ListNode tem = null;
        for (int i = 1; i < n; i++) {
            tem = new ListNode(i);
            pre.next = tem;
            pre = tem;
        }
        tem.next = head;
        ListNode tem2 = head;
        while(n>=1){
            for (int i = 1; i < m-1; i++) {
                tem2 = tem2.next;
            }
            tem2.next = tem2.next.next; //删除第m个节点
            head = tem2.next; //重新设置头结点
            n--;
        }
        return head.val;
    }
}
