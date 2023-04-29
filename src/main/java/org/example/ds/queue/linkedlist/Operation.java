package org.example.ds.queue.linkedlist;

public class Operation {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.createQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        queue.traverseQueue();

        System.out.println();

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println();

        queue.traverseQueue();

        queue.deleteQueue();
    }

}
