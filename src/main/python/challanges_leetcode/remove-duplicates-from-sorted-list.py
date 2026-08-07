class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def print(self):
        node = self
        while node:
            print(node.val, end=" -> ")
            node = node.next

class Solution(object):
    def deleteDuplicates(self, head):
        current = head
        while current and current.next:
            if current.val == current.next.val:
                current.next = current.next.next
            else:
                current = current.next
        return head

def main():
    ListNode1 = ListNode(1)
    ListNode2 = ListNode(1)
    ListNode3 = ListNode(2)
    ListNode4 = ListNode(3)
    ListNode5 = ListNode(3)

    ListNode1.next = ListNode2
    ListNode2.next = ListNode3
    ListNode3.next = ListNode4
    ListNode4.next = ListNode5
    
    result = Solution().deleteDuplicates(ListNode1)
    result.print()
    print()

if __name__ == "__main__":
    main()
