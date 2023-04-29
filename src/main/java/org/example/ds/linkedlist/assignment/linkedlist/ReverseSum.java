package org.example.ds.linkedlist.assignment.linkedlist;

public class ReverseSum {

    public LinkedList reverseSum(LinkedList ll1, LinkedList ll2){
        int i=0;
        int num1=0, num2=0;
        Node temp = ll1.head;
        while(i!= ll1.size){
            num1 = temp.value*(int)Math.pow(10,i)+num1;
            temp = temp.next;
            i++;
        }
        i=0;
        temp = ll2.head;
        while(i!= ll2.size){
            num2 = temp.value*(int)Math.pow(10,i) + num2;
            temp = temp.next;
            i++;
        }
        int sum = num1+num2;
        LinkedList ll3 = new LinkedList();
        ll3.createLL(sum%10);
        sum = sum/10;
        while(sum!=0){
            ll3.insertNode(sum%10);
            sum = sum/10;
        }
        return ll3;
    }
}
