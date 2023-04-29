package org.example.ds.stack.linkedlist;

public class Operation {

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        //create stack
        stack.createStack();
        //push
        for(int i=0;i<10;i++)
            stack.push(i);

        stack.printStack();

        //pop
        for(int i=0;i<10;i++) {
            System.out.println(stack.pop());


        }
        //deleteStack
        stack.deleteStack();

    }

}
