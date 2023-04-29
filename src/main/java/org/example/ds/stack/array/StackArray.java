package org.example.ds.stack.array;

public class StackArray {

    int top;
    int size;
    int[] arr;

    public int[] createStack(int size){
        this.top = -1;
        this.size = size;
        this.arr = new int[size];
        return arr;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public int push(int data){
         if (isFull())
            return -1;
        else{
            top++;
           arr[top] = data;
        }
        return 1;
    }

    public int pop(){
        int data=-1;
        if(isEmpty())
            return -1;
        else{
            data = arr[top];
            top--;
        }
        return data;
    }

    public int peek(){
        int data=-1;
        if(isEmpty())
            return -1;
        else
            data = arr[top];
        return data;
    }

    public int deleteStack(){
        try {
            arr = null;
        }catch (Exception e){return -1;}
        return 1;
    }

    public void printStack(){
        if(isEmpty())
            System.out.println("Stack is Empty");
        for(int i=0;i<=top;i++)
            System.out.println(arr[i]);
    }
}
