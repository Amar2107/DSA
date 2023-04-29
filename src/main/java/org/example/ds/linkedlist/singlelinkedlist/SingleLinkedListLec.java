package org.example.ds.linkedlist.singlelinkedlist;

import java.util.LinkedList;
import java.util.List;

public class SingleLinkedListLec {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        //Node head = sll.createSingleLinkedList(90);
        //sll.printList(head);

        sll.insertIntoList(80,1);
        sll.insertIntoList(70,2);
        sll.insertIntoList(60,3);
        sll.insertIntoList(50,4);
        sll.insertIntoList(40,5);

        sll.printList(sll.head);
        System.out.println("=================         =======================");
        sll.insertIntoList(90,0);
        sll.insertIntoList(30,6);
        sll.printList(sll.head);
        System.out.println("=================    search 50     =======================");
        System.out.println(sll.searchData(50));
        System.out.println(" ===================   Delete head  =======================");
        sll.removeData(40);
        sll.printList(sll.head);
        sll.deleteSingleLinkedList();
        sll.printList(sll.head);


        List<Integer> ll = new LinkedList<>();
        ll.add(43);
        ll.add(13);
        ll.add(23);
        ll.add(53);
        ll.add(63);

        ll.remove(63);

    }
}
