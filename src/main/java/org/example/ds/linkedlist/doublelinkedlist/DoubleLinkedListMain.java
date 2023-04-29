package org.example.ds.linkedlist.doublelinkedlist;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

//        dll.createDoubleLinkedList(10);
//        System.out.println(dll.head.data);
//        System.out.println(dll.head.prev);
//        System.out.println(dll.head.next);

        dll.insertNode(0,1);
        dll.insertNode(1,3);
        dll.insertNode(2,5);
        dll.insertNode(3,7);


        dll.printList();



        System.out.println("+++++++++++++ Insertion in Between ++++++++++++++++");

        dll.insertNode(2,4);

        dll.printList();

        dll.insertNode(4,6);

        dll.printList();

        System.out.println("+++++++++++++ Delete ++++++++++++++++");

        dll.deleteNode(7);
        dll.deleteNode(4);

        dll.printList();

        System.out.println("+++++++++++++ Reverse ++++++++++++++++");

        dll.printReverseList();

    }
}
