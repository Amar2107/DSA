package org.example.ds.queue.linkedlist;

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

}

public class Queue {

    Node head;
    Node tail;
    int size;

    public Node createQueue(){
        head = null;
        tail = null;
        size = 0;
        return head;
    }

    public boolean isEmpty(){
        return (head == null || tail == null);
    }

    public int push(int value){
        Node node = new Node(value);
        if(isEmpty())
        {
            head = tail = node;
            size = 1;
        }
        else {
            tail.next = node;
            tail = node;
        }
        size++;
        return value;
    }

    public int pop(){
        int res = -1;
        if(isEmpty())
            return res;
        else{
            Node temp = head;
            while (temp.next != tail)
                temp = temp.next;
            res = tail.value;
            tail = temp;
            tail.next = null;
        }
        return res;
    }

    public void deleteQueue(){
        head = tail = null;
    }

    public void traverseQueue(){
        Node temp = head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
