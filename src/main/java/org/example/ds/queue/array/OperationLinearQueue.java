package org.example.ds.queue.array;

public class OperationLinearQueue {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.createQueue(10);

        for (int i=5;i<11;i++)
            queue.enQueue(i);

        queue.printQueue();

        System.out.println("pop "+queue.deQueue());
        System.out.println("pop "+queue.deQueue());
        System.out.println("pop "+queue.deQueue());


        queue.enQueue(11);
        queue.enQueue(12);

        queue.printQueue();

        for(int i= queue.head;i<= queue.tail;i++)
            System.out.println("pop "+queue.deQueue());


        queue.deleteQueue();

    }
}
