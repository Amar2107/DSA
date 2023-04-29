package org.example.ds.linkedlist.singlelinkedlist;

public class SingleLinkedList {

    public Node head;
    public Node tail;

    public int size;

    /*
    * O(1) for creating a LinkedList space and time
    * */
    public Node createSingleLinkedList (int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
        return head;
    }


    //Insert node into LinkedList
    public void insertIntoList(int value, int location)
    {
       Node node = new Node(value);
       if(head == null) {
           createSingleLinkedList(value);
       }else if(location == 0) {
           node.next = head;
           head = node;
       }else if(location >= size){
           node.next = null;
            tail.next = node;
            tail = node;
       }else{
           int v=0;
           Node temp = head;
           while (v != location-1) {
               temp = temp.next;
               v++;
           }
           node.next = temp.next;
           temp.next = node;
       }
    }

    /*
     * O(N)
     * */
    public void printList(Node head){
        Node temp = head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /*
    * O(N)
    * */
    public int searchData(int value){
        int v=0;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == value)
                return v;
            v++;
            temp = temp.next;
        }
        return -1;
    }
    /*
    O(N) when data is somewhere in middle
    O(1) when data is near head or tail
     */
    public void removeData(int value){
       if(head == tail)
           head = tail = null;
        else{
           Node temp = head;
           if(head.data == value)
               head = temp.next;
           else {
               try {
               Node befTemp = null;
               while (temp.data != value) {
                   befTemp = temp;
                   temp = temp.next;
               }
               if (tail.data == value) {
                   tail = befTemp;
                   befTemp.next = null;
               } else
                   befTemp.next = temp.next;
           }catch (NullPointerException e){System.out.println("Data not present in the list");}
           }
       }
    }

    public void deleteSingleLinkedList(){
        head = tail = null;
        System.out.println("All the elements of the list are now eligible for garbage collection");
    }
}
