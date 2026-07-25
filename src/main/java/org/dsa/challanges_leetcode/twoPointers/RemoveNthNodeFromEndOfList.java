package org.dsa.challanges_leetcode.twoPointers;

public class RemoveNthNodeFromEndOfList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow = head;
            ListNode fast = head;

            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }

            if (fast == null) return head.next;

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;

            return head;
        }

        static ListNode print(ListNode head) {
            ListNode curr =  head;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
            System.out.println();
            return curr;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);

        head.removeNthFromEnd(head, 3);

        ListNode.print(head);
    }
}
