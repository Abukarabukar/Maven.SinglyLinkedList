package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

   // Node next;
    Node head;
    public class Node{
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            next = null;
        }
    }


public void insert(int data){
        Node node = new Node(data);
        node.data = data;
    if (head == null){
        head = node;
    }
    else {
        Node n = head;
        while (n.next != null){
            n = n.next;
        }
        n.next = node;
    }
}

    public void remove(int index) {
        Node node = head;
        if (index == 0) {

            head = head.next;
        } else {

            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }


            node.next = node.next.next;
        }
    }

    public boolean contains(int data)
    {
        Node node = head;

        while (node != null)
        {
            if (node.data == data)
            {
                return true;
            }

            node = node.next;
        }

        return false;
    }

    public int find(int data) {

        Node node = head;
        int index = 0;
        while(node!=null){
            if(node.data == data){
                return index;
            }

            node = node.next;
            index++;
        }
        return -1;
    }


    public SinglyLinkedList copy() {
        SinglyLinkedList copy = new SinglyLinkedList();
        Node node = head;
        while (node != null) {
            copy.insert(node.data);
            node = node.next;
        }
        return copy;
    }
    public void sort()
    {

        // Node current will point to head
        Node current = head, index = null;

        int temp;

        if (head == null) {

        }
        else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

// Node new_node = new Node(data);


    public int get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public int size() {
        int count = 0;
        Node node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}


