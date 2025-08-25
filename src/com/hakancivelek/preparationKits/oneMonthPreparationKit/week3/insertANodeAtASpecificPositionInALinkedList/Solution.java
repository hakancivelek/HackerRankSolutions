package com.hakancivelek.preparationKits.oneMonthPreparationKit.week3.insertANodeAtASpecificPositionInALinkedList;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.nextLine();

        IntStream.range(0, llistCount).forEach(i -> {
            int llistItem = scanner.nextInt();
            scanner.nextLine();
            llist.insertNode(llistItem);
        });

        int data = scanner.nextInt();
        int position = scanner.nextInt();

        SinglyLinkedListNode llist_head = Result.insertNodeAtPosition(llist.head, data, position);

        SinglyLinkedListPrintHelper.printList(llist_head, " ");
        System.out.println();

        scanner.close();
    }
}

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
}