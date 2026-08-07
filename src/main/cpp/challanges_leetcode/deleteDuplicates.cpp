void removeDuplicates()
{
    Node *current = head;

    while (current)
    {
        Node *runner = current;
        while (runner->next != nullptr)
        {
            if (runner->next->value == current->value)
            {
                Node *duplicate = runner->next;
                runner->next = runner->next->next;
                delete duplicate;
                length--;
            }
            else
            {
                runner = runner->next;
            }
        }

        current = current->next;
    }
}
