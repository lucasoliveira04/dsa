package org.dsa.challanges_leetcode.twoPointers;

public class MiddleOfTheLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        static boolean printList(ListNode head) {
            while (head != null) {
                System.out.print(head.val + " - ");
                head = head.next;
            }
            System.out.println("NULL");
            return false;
        }
    }

    public static ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode.printList(head);
        System.out.println(ListNode.printList(getMiddle(head)));
    }
}
