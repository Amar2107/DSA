package org.example.ds.linkedlist.operations;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        size=1;
        return head;
    }
    public void push(int value){
        if(head == null){
           createLinkedList(value);
           return;
        }else{
            Node node = new Node(value);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insert(int index, int value){
        if(head == null) {
            createLinkedList(value);
            return;
        }
        else{
            Node node = new Node(value);
            if(index == 0){
                node.next = head;
                head = node;
            }else if(index>= size)
            {
                tail.next = node;
                node = tail;
            }else{
                Node temp = head;
                int i=0;
                while(i!=index-1){
                    temp =temp.next;
                    i++;
                }
                node.next = temp.next;
                temp.next =node;
            }
        }
        size++;
    }

    public Node pop(){
        Node res;
        if(head == null)
            return new Node(-1);
        if(head == tail){
            res = tail;
            head = tail = null;
        }else{
            Node temp = head;
            while (temp.next!=tail){
                temp =temp.next;
            }
            res = tail;
            temp.next =null;
            tail = temp;
        }
        size--;
        return res;
    }

    public Node get(int location){
        Node temp = head;
        int i = 0;
        if(location>size || location<0)
            return null;
        while (i != location-1){
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public void traverseAll(){
        Node temp = head;
        int i=0;
        while(temp!=null){
            System.out.println(i+" value "+ temp.value);
            temp = temp.next;
            i++;
        }
    }

}
