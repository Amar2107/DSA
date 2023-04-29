package org.example.ds.stack.linkedlist;

class Node{
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
        this.next = null;
    }
}
public class StackLinkedList {

    Node head;
    int size;

    public Node createStack(){
        head = null;
        size = -1;
        return head;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int push(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            size=1;
        }
        else {
            node.next = head;
            head = node;
        }
        size++;
        return 1;
    }

    public int pop(){
        int value= -1;
        if (isEmpty())
            return -1;
        else{
            value = head.value;
            head = head.next;
        }
        size--;
        return value;
    }

    public int peek()
    {
        if (isEmpty())
            return -1;
        else
            return head.value;
    }

    public void printStack(){
        Node temp = head;
        while (temp != null){
            System.out.println("temp "+temp.value);
            temp = temp.next;
        }
    }

    public int deleteStack(){
        try {
            head = null;
        }catch (Exception e){return -1;}
        return 1;
    }

}
