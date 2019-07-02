package com.Jianoffer.list;


import java.util.ArrayList;

public class main_func {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode head = new ListNode(0);
        ListNode RingHead = new ListNode(5);
        head.next = node1;
        printList(head);
        offer_13_DeleteNode delnode = new offer_13_DeleteNode();
        //ListNode newnode = delnode.deleteNode(node1,node1);
        offer18_Delte_repeatNode deln = new offer18_Delte_repeatNode();
        ListNode newnode = deln.DelDuplication(head);
        offer_56_Ring_entrance enre = new offer_56_Ring_entrance();
        printList(newnode);
        RingHead.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;
        ListNode entrance = enre.EntranceNodeOfLoop(RingHead);
        System.out.println(entrance.val);
    }
}
