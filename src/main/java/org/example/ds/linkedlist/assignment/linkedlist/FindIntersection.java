package org.example.ds.linkedlist.assignment.linkedlist;

public class FindIntersection {

    void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node(nodeValue);
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
        llA.size++;
        llB.size++;
    }



    public static void main(String[] args) {
        LinkedList llA = new LinkedList();
        llA.createLL(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        LinkedList llB = new LinkedList();
        llB.createLL(2);
        llB.insertNode(4);
        llB.insertNode(6);
        FindIntersection ex = new FindIntersection();
        ex.addSameNode(llA, llB, 7);
        ex.addSameNode(llA, llB, 2);
        ex.addSameNode(llA, llB, 1);

        llA.traversalLL();
        System.out.println();
        llB.traversalLL();
    }

}
