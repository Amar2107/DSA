package org.example.ds.linkedlist.assignment.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListMain {

    public static void removeDup(LinkedList ll) {
        Node temp = ll.head;
        Node prev = null;
        Set<Integer> hset = new HashSet<>();
        while(temp!=null){
            if(hset.contains(temp.value)) {
                prev.next = temp.next;
                ll.size --;
            }else {
                hset.add(temp.value);
                prev = temp;
            }
            temp = temp.next;
        }
    }


    public static int ntoLast(int n,LinkedList ll){
        int index = ll.size - n;
        Node temp = ll.head;
        for(int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        return temp.value;
    }

    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.createLL(1);
//        ll.insertNode(2);
//        ll.insertNode(3);
//        ll.insertNode(4);
//        ll.insertNode(5);
//
//        ll.traversalLL();
//        //removeDup(ll);
//        System.out.println();
//        System.out.println(ntoLast(2,ll));
//        System.out.println();
//        ll.traversalLL();

        LinkedList ll1 = new LinkedList();
        ll1.createLL(7);
        ll1.insertNode(1);
        ll1.insertNode(6);
        LinkedList ll2 = new LinkedList();
        ll2.createLL(5);
        ll2.insertNode(9);
        ll2.insertNode(2);

        ReverseSum rs = new ReverseSum();
        LinkedList ll3 = rs.reverseSum(ll1,ll2);
        ll3.traversalLL();
    }
}
