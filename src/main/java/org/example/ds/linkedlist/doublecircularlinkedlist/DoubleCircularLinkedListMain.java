package org.example.ds.linkedlist.doublecircularlinkedlist;

public class DoubleCircularLinkedListMain {
    public static void main(String[] args) {
        DoubleCircularLinkedList dlc = new DoubleCircularLinkedList();
//        dlc.createDoubleCircularLinkedList(5);
//        System.out.println("Head "+dlc.head.data+" tail "+dlc.tail.data+" dlc.tail.next "+ dlc.tail.next.data);

        dlc.insertNode(0,4);
        dlc.insertNode(1,1);
        dlc.insertNode(2,8);
        dlc.insertNode(3,2);
        dlc.insertNode(4,6);
        dlc.insertNode(5,0);


        dlc.printList();

        System.out.println("============  Delete  ==============");

        dlc.deleteNode(0);
        //dlc.insertNode(2,5);
        dlc.printList();

        System.out.println("============  Reverse  ==============");
        dlc.printReverseList();
        System.out.println("Head "+dlc.head.data+" tail "+dlc.tail.data+" dlc.tail.next "+ dlc.tail.next.data);


    }
}
