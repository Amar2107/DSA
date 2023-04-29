package org.example.ds.stack.assignment;

class Node{
    int value;
    Node next;
    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

public class StackMin {

    Node top;
    Node min;


    public StackMin() {
        top = min = null;
        // TODO
    }

    public boolean isEmpty(){
        return min == null;
    }

    public int min() {
        return min.value;
    }

    public void push(int value) {
        if(isEmpty()){
            min = new Node(value,min);
        }else if(min.value < value){
            min = new Node(min.value,min);
        }else{
            min = new Node(value,min);
        }
        top = new Node(value,top);
    }

    public int pop() {
        min = min.next;
        Node res = top;
        top = top.next;
        return res.value;
    }
}