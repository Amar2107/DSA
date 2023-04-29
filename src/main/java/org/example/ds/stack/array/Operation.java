package org.example.ds.stack.array;

public class Operation {

    public static void main(String[] args) {
        StackArray stack = new StackArray();

        //create stack
        stack.createStack(5);
        //push
        for(int i=1;i<=6;i++)
        {
            int f = stack.push(i);
            if(f == -1) {
                System.out.println("Array Full");
                break;
            }
        }
        System.out.println(" top "+stack.peek());
        //pop()
        for(int i=stack.top;i>-1 ;i--)
            System.out.println(stack.pop());

        //deleteStack
        stack.deleteStack();
    }
}
