package com.hakancivelek.preparationKits.oneMonthPreparationKit.week3.insertANodeAtASpecificPositionInALinkedList;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Inserts a new node with given data at the specified position in the linked list.
     *
     * @param llist    The head of the linked list.
     * @param data     The data value of the new node.
     * @param position The position at which to insert the new node.
     * @return The head of the updated linked list.
     */
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (position == 0) {
            newNode.next = llist;
            return newNode;
        }

        SinglyLinkedListNode current = llist;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }

        return llist;
    }
}