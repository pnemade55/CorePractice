package com.pn.core;

import java.util.HashSet;

/**
 * created by : pnema
 * on 6/18/2021
 */
public class DuplicatesInLinkedList {

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

    static int duplicates(Node head){
        HashSet<Integer> items= new HashSet<>();
        int count=0;
        while(head != null){
            if(!items.contains(head.data)){
                items.add(head.data);
            }else{
                count++;
            }
            head= head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 5);
        head = insert(head, 7);
        head = insert(head, 5);
        head = insert(head, 1);
        head = insert(head, 7);

        System.out.println( duplicates(head));
    }
}
