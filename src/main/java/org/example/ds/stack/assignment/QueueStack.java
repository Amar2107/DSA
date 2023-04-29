package org.example.ds.stack.assignment;

import java.util.Iterator;
import java.util.Stack;

/*
* 1 2 3 4 5 -> 5 4 3 2 1 -> 1 2 3 4 5
* */
public class QueueStack {
    Stack<Integer> oldStack, newStack;

    QueueStack(){
        this.oldStack = new Stack<>();
        this.newStack = new Stack<>();
    }

    public void enqueue(int value){
        oldStack.push(value);
    }

    public int dequeue(){
        while (!oldStack.empty()){
            newStack.push(oldStack.pop());
        }
        return newStack.pop();
    }

    public void printStack(){
        Iterator<Integer> var = newStack.iterator();
        while (var.hasNext()){
            System.out.println(var.next());
        }
    }

}

class Operation{

    public static void main(String[] args) {
        QueueStack stack = new QueueStack();
        stack.enqueue(1);
        stack.enqueue(2);
        stack.enqueue(3);
        stack.enqueue(4);

        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());


    }
}