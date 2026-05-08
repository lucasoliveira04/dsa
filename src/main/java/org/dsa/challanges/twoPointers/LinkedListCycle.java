package org.dsa.challanges.twoPointers;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean detectCycle(ListNode head) {
        ListNode left = head;
        Set<ListNode> set = new HashSet<>();

        while (left != null) {
            if (set.contains(left)) {
                return true;
            }
            set.add(left);
            left = left.next;
        }

        return false;
    }

    public ListNode detectBeginCycle(ListNode head) {
        ListNode left = head;
        Set<ListNode> set = new HashSet<>();

        while (left != null) {
            if (set.contains(left)) {
                return left;
            }
            set.add(left);
            left = left.next;
        }

        return null;
    }


    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.next = n1;

        int nodeInt = solution.detectBeginCycle(n1).val;

        System.out.println(solution.detectCycle(n1));
        System.out.println(nodeInt);
    }


}
