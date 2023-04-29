package org.example.ds.stack.linkedlist;

import org.example.ds.stack.assignment.StackMin;

public class StackMinOperation {
    public static void main(String[] args) {
        StackMin stackMin = new StackMin();

        stackMin.push(3);
        stackMin.push(4);
        stackMin.push(5);
        stackMin.push(1);


        System.out.println(stackMin.min()+" "+stackMin.pop());
        System.out.println(stackMin.min()+" "+stackMin.pop());
        System.out.println(stackMin.min()+" "+stackMin.pop());
        System.out.println(stackMin.min()+" "+stackMin.pop());


    }
}
