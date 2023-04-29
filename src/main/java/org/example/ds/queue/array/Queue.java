package org.example.ds.queue.array;

public class Queue {

    int head;
    int tail;
    int size;
    int a[];

    public int[] createQueue(int size){
        this.head = -1;
        this.tail = -1;
        this.size = size;
        a = new int[size];
        return a;
    }

    public boolean isEmpty(){
        return head > tail;
    }

    public boolean isFull(){
        return tail == size-1;
    }

    public int enQueue(int data){
        if(isFull()) {
            System.out.println(" Queue is full ");
            return -1;
        } else if (tail == -1 && head ==  tail) {
            head = 0;
            tail = 0;
            a[tail] = data;
        } else{
            tail++;
            a[tail] = data;
        }
        return data;
    }

    public int deQueue(){
        int data = -1;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else {
            data = a[head];
            head++;
        }
        return data;
    }

    public void printQueue(){
        for(int i=head;i<=tail;i++)
            System.out.println(a[i]);
    }

    public void deleteQueue(){
        a = null;
    }

}
