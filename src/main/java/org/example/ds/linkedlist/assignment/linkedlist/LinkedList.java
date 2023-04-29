package org.example.ds.linkedlist.assignment.linkedlist;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;



    public void createLL(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        size =1;
    }

    public void insertNode(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i =0; i<size; i++) {
            System.out.print(tempNode.value);
            if (i != size -1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
    }

    public void push(int data) {
    }
}
