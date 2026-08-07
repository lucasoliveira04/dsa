Node *findKthFromEnd(int k)
{
    if (head == nullptr || k <= 0)
        return nullptr;

    Node *fast = head;
    Node *slow = head;

    for (int i = 0; i < k; i++)
    {
        if (fast == nullptr)
            return nullptr;
        fast = fast->next;
    }

    while (fast != nullptr)
    {
        slow = slow->next;
        fast = fast->next;
    }

    return slow;
}
