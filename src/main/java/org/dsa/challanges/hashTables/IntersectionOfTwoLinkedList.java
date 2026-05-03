package org.dsa.challanges.hashTables;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class IntersectionOfTwoLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        static void printList(ListNode head) {
            ListNode curr = head;
            while (curr != null) {
                System.out.print(curr.val + " → ");
                curr = curr.next;
            }
            System.out.println();
        }

        boolean isIntersect(ListNode head1, ListNode head2) {
            Set<ListNode> set = new HashSet<>();
            ListNode curr = head1;
            ListNode curr2 = head2;

            while (curr != null) {
                set.add(curr);
                curr = curr.next;
            }

            while (curr2 != null) {
                if (set.contains(curr2)) {
                    return true;
                }

                curr2 = curr2.next;
            }

            return false;
        }
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);

        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(4);

        l1.next.next = intersection;
        l2.next.next = intersection;

        ListNode.printList(l1);
        ListNode.printList(l2);

        if (intersection.isIntersect(l1, l2)) {
            System.out.println("Intersection found");
        }  else {
            System.out.println("Not found");
        }
    }

}
