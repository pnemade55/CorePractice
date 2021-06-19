package com.pn.core;

/**
 * created by : pnema
 * on 6/18/2021
 */
public class ReverseLinkedList {

    static class Node{
        int data;
        Node next;
    }

    static Node insert(Node head, int item){
        Node temp= new Node();
        temp.data=item;
        temp.next= head;
        head=temp;
        return head;
    }

    static Node reverse(Node head){
        Node current=head;
        Node prev= null;
        Node next= null;

        while(current != null){
            next = current.next;
            current.next= prev;
            prev= current;
            current= next;
        }
        head= prev;

        return prev;
    }

    static void print(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
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
        print(head);
        print(reverse(head));

    }
}
