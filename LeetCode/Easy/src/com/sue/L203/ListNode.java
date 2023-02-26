package com.sue.L203;

/**
 * @author Anthony
 * @create 2022-10-31 12:15
 */

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printList() {
        ListNode tmp = this;
        //遍历输出 next的val
        while (tmp != null) {
            System.out.print(tmp.val);
            if (tmp.next != null) {
                System.out.print("->");
            }
            tmp = tmp.next;
        }
        System.out.println();

    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next=head;
        ListNode temp=dummyNode;
        while (temp.next!=null){
            if (temp.next.val==val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return dummyNode.next;


    }
}


class Solution1{
    public static void main(String[] args) {
//        head = [1,2,6,3,4,5,6], val = 6
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        int val = 6;
        Solution s = new Solution();
        ListNode res = s.removeElements(l1, val);
        res.printList();

    }
}
