package org.example.ds.linkedlist.doublecircularlinkedlist;

public class DoubleCircularLinkedList {

    int size;
    Node head;
    Node tail;

    public Node createDoubleCircularLinkedList(int data){
        Node node = new Node(data);
        head = node;
        tail = node;
        node.next = node;
        size = 1;
        return head;
    }

    public void insertNode(int index,int data){
        if(head == null){
            createDoubleCircularLinkedList(data);
            return ;
        }else{
            Node node = new Node(data);
            if(index == 0) {
                node.next = head;
                node.prev = tail;
                head.prev = node;
                head = node;
                tail.next = head;
            } else if(index >=size){
                tail.next = node;
                node.prev = tail;
                node.next = head;
                head.prev = node;
                tail = node;
            } else{
                int i=0;
                Node temp = head;
                while(i != index){
                    temp =temp.next;
                    i++;
                }
                temp.prev.next = node;
                node.prev = temp.prev;
                node.next = temp;
                temp.prev = node;
            }
        }
        size++;
    }

    public void printList(){
        int i=0;
        Node temp=head;
        while(i!=size){
            System.out.println(i+" value "+temp.data);
            temp = temp.next;
            i++;
        }
    }

    public void printReverseList(){
        int i=size-1;
        Node temp=tail;
        while(i!=-1){
            System.out.println(i+" value "+temp.data);
            temp = temp.prev;
            i--;
        }
    }

    public void deleteNode(int data){
        if(head == tail){
            head.prev = null;
            head.next = null;
            head = null;
            tail = null;
        }else{
            if(data == head.data)
            {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            Node temp = head;
            if(tail.data == data)
            {
                tail.prev.next = head;
                head.prev =tail.prev;
                tail = tail.prev;
            }
            else{
                while (temp.data!=data) {
                    temp = temp.next;
                }
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
        size --;
    }

}
