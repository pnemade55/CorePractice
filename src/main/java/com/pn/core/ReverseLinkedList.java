package com.pn.core;

/**
 * created by : pnema
 * on 6/18/2021
 */
public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;
    }

    static Node insert(Node head, int item) {
        Node temp = new Node();
        temp.data = item;
        temp.next = head;
        head = temp;
        return head;
    }

    static Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next; //next = 2 -> 3 -> 4  // next = 3 -> 4
            current.next = prev;  //current= 1 -> null   // current = 2 -> 1 -> null
            prev = current;      //prev = 1 -> null     // prev = 2 -> 1 -> null
            current = next;       //crrent = 2-> 3-> 4   // current = 3 -> 4
        }
        head = prev;

        return prev;
    }

    static void getNthFromLast(Node head, int n) {
        // Your code here
        int n1 = n;
        Node fastptr = head;
        Node slowptr = head;
        int count1 = 0;
        int count2 = 0;
        while (fastptr != null) {
            if (n > 0) {
                count1++;
                fastptr = fastptr.next;
                n -= 1;
            } else {
                count1++;
                count2++;
                fastptr = fastptr.next;
                slowptr = slowptr.next;
            }
        }
        if ((count1 - count2) == n1) {
            System.out.println(n1 + " th from last:" + slowptr.data);
        } else {
            System.out.println(n1 + " th from last: -1");
        }
        System.out.println("-------------------------------");
    }

    static void printMiddleElement(Node head) {
        Node fastptr = head;
        Node slowptr = head;

        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        System.out.println("Middle Element: " + slowptr.data);
        System.out.println("-------------------------------");
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
        System.out.println("-------------------------------");
    }


    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 5);
        head = insert(head, 7);
        head = insert(head, 5);
        head = insert(head, 1);
        head = insert(head, 7);
        head = insert(head, 9);
        print(head);
        getNthFromLast(head, 2);
        printMiddleElement(head);
        print(reverse(head));

    }
}
