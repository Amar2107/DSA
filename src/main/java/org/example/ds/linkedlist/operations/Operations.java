package org.example.ds.linkedlist.operations;


public class Operations {


    public static void push(LinkedList ll, int data){
        ll.push(data);
    }


    private static void getElement(LinkedList ll,int location) {
        Node temp = ll.get(location);
        System.out.println(temp.value);
    }

    private static void printAll(LinkedList ll) {
        ll.traverseAll();
    }

    private static void insertElement(LinkedList ll, int i, int value) {
        ll.insert(i,value);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        push(ll,1);
        push(ll,2);
        push(ll,3);

        insertElement(ll,3,4);

        printAll(ll);
       // getElement(ll,3);
        System.out.println(ll.size);
//        ll.pop();
//        System.out.println(ll.size);
        printAll(ll);
    }




}
