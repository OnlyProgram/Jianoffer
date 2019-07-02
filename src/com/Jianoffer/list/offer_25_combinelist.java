package com.Jianoffer.list;


public class offer_25_combinelist {
    public ListNode CombineList(ListNode firstlist,ListNode secondlist){
        ListNode l= new ListNode(0);
        ListNode combine = l;
        if(firstlist==null){
            return secondlist;
        }
        if(secondlist==null){return firstlist;}
        while (firstlist != null && secondlist!=null){
            if(firstlist.val<secondlist.val){
                combine.next = firstlist;
                firstlist = firstlist.next;
            }
            else {
                combine.next = secondlist;
                secondlist = secondlist.next;
            }
            combine = combine.next;
        }
        if(firstlist!=null){
            combine.next = firstlist;
        }
        if(secondlist!=null){
            combine.next = secondlist;
        }
        return l.next;
    }
    //递归实现
    public ListNode CombineList2(ListNode firstlist,ListNode secondlist){
        if(firstlist==null){
            return secondlist;
        }
        if(secondlist==null){return firstlist;}
        ListNode merge = null;
        if(firstlist.val<secondlist.val){
            merge = firstlist;
            merge.next = CombineList2(firstlist.next,secondlist);
        }
        else {
            merge = secondlist;
            merge.next = CombineList2(firstlist,secondlist.next);
        }
        return merge;
    }
}
