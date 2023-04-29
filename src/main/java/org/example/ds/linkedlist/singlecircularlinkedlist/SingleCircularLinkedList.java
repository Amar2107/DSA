package org.example.ds.linkedlist.singlecircularlinkedlist;

public class SingleCircularLinkedList {

    Node head;
    Node tail;
    int size;

    public Node createSCL(int data){

        Node node = new Node(data);
        node.next = node;
        head = node;
        tail = node;
        size=1;

        return head;
    }

    public void insertNode(int data,int index){
        Node node = new Node(data);
        if(head==null) {
            createSCL(data);
            return;
        }
        else if(index == 0)
        {
            node.next = head;
            head = node;
            tail.next = node;
        }
        else if(index >= size){
          tail.next = node;
          tail = node;
          node.next =head;
        }
        else{
            int i=0;
            Node temp=head;
            while(i!=index){
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }

    public void printList(){
        int index=0;
        Node temp = head;
        while(index!=size){
            System.out.println(index+" value "+temp.data);
            temp =temp.next;
            index++;
        }
    }

    public int indexOf(int data){
        Node temp = head;
        int index= 0;
        while(index != size){
            if(temp.data == data)
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }


    public void deleteNode(int data){
        if(head == tail){
            head.next.next = null;
            head = null;
            tail = null;
        }
        else{
            Node temp = head;
            if(head.data == data){
                head = temp.next;
                tail.next = head;
            }
            else{
                Node befTemp=null;
                while(temp.data!=data){
                    befTemp = temp;
                    temp = temp.next;
                }
                if(temp.data == tail.data){
                    tail = befTemp;
                    befTemp.next = head;
                }
                else
                    befTemp.next = temp.next;
            }
        }
        size--;
    }

    public void deleteAll(){
        head = tail = null;
    }

}
