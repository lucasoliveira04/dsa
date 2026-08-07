int fastMiddleNode()
{
    Node* slow = head;
    Node* fast = head;

    while (fast && fast->next != nullptr){
        slow = slow->next;
        fast = fast->next->next;
    }

    return slow;
}
