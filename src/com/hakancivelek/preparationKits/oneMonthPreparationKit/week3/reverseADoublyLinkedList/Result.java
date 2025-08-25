package com.hakancivelek.preparationKits.oneMonthPreparationKit.week3.reverseADoublyLinkedList;

/**
 * Result contains the function to reverse a doubly linked list.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class Result {

    /**
     * Reverses a given doubly linked list.
     *
     * @param llist the head node of the doubly linked list
     * @return the new head node of the reversed doubly linked list
     */
    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode next = null;
        DoublyLinkedListNode prev = null;

        while (current != null) {
            next = current.next;
            current.prev = next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}