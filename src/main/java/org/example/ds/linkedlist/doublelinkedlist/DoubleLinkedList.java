package org.example.ds.linkedlist.doublelinkedlist;

public class DoubleLinkedList {

    Node head;
    Node tail;
    int size;

    public Node createDoubleLinkedList(int data){
        Node node = new Node(data);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertNode(int index, int data){
        if(head == null) {
            System.out.println("Creating the double linked list");
            createDoubleLinkedList(data);
            return;
        }
        else{
            Node node = new Node(data);
            if(index == 0)
            {
                System.out.println("Inserting the first element");
                node.next = head;
                head.prev = node;
                head = node;
            }
            else if(index >= size){
                System.out.println("Inserting the last element");
               node.prev = tail;
               tail.next = node;
               tail = node;
            }
            else{
                System.out.println("Somewhere in middle ");
                int i=0;
                Node temp = head;
                while(i!=index-1)
                {
                    temp = temp.next;
                    i++;
                }
                node.prev = temp;
                node.next = temp.next;
                temp.next.prev = node;
                temp.next = node;
            }
        }
        size++;
    }


    public void printList(){
        Node temp = head;
       while (temp != null){
           System.out.println("values "+temp.data);
           temp = temp.next;
       }
    }

    public void printReverseList(){
        Node temp = tail;
        int length=  size;
        while(length!=0)
        {
            System.out.println("Values "+temp.data);
            temp = temp.prev;
            length --;
        }
    }


    public void deleteNode(int data){
        if(head == tail){
            head = null;
            tail = null;
        } else{
            Node temp = head;
            if(head.data == data){
                head = temp.next;
                temp.next.prev = null;
            }
            else{
                while(temp.data != data) {
                    temp = temp.next;
                }
                if(tail.data == data) {
                    tail = temp.prev;
                    temp.prev.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
        }
        size --;
    }

    public void deleteDll(){
        Node temp = head;
        while(temp !=null){
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        tail = null;
    }
}
