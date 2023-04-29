package org.example.ds.linkedlist.singlecircularlinkedlist;

public class SingleCircularLinkedListMain {

    public static void main(String[] args) {
        SingleCircularLinkedList scl = new SingleCircularLinkedList();
        //scl.createSCL(5);
        //System.out.println(scl.head.data);
        //System.out.println(scl.head.next.data);
        scl.insertNode(1,0);
        scl.insertNode(3,1);
        scl.insertNode(5,2);
        scl.insertNode(6,3);
        scl.insertNode(7,4);
        scl.printList();
        scl.deleteNode(7);
        scl.deleteNode(1);
        System.out.println("====================     Delete Node      ======================");
        scl.printList();
        System.out.println(scl.tail.next.data);
    }
}
