package com.Jianoffer.list;


/**
 * 找到环的入口，链表中存在环
 * 思路：第一步：找到环中节点数（FastPointer,lowPointer）
 */
public class offer_56_Ring_entrance {
    //查看是否有环,快指针与慢指针相遇则有环
    private ListNode MeettingNode(ListNode pHead){
        if(pHead ==null){return null;}//空链表处理
        ListNode slowPointer = pHead;
        if(slowPointer.next==null){return null;}//无环链表处理
        ListNode fastPointer = slowPointer.next;

        while(fastPointer != null && slowPointer!=null){
            if(fastPointer==slowPointer){return fastPointer;}
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
            if(fastPointer!=null){
                fastPointer = fastPointer.next;
            }
        }
        return null;
    }
    public ListNode EntranceNodeOfLoop(ListNode  phead){
        ListNode mettingNode = MeettingNode(phead); //相遇节点
        if(mettingNode==null){return null;}//无环
        int nodesInLoop = 1;  //计数，标记环中节点的数目
        ListNode p1 = mettingNode;
        while (p1.next != mettingNode){
            p1 = p1.next;
            ++nodesInLoop;
        }
        p1 = phead;
        for (int i = 0; i < nodesInLoop; i++) {
            p1 = p1.next;
        }
        //p1,p2同步走
        ListNode p2 = phead;
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}

