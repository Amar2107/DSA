package org.example.ds.stack.assignment;

public class ThreeInOne {
     int numberOfStacks = 3;
     int stackCapacity;
     int[] values;
     int[] sizes;
     int[] tops;

    public ThreeInOne(int stackSize) {
        this.stackCapacity = stackSize;
        this.values = new int[stackSize];
        this.sizes = new int[numberOfStacks+1];
        tops = new int[numberOfStacks];
        sizes[0] = 0;
        for(int i = 0;i<numberOfStacks;i++)
        {
            sizes[i+1] = (i+1)*(stackCapacity/numberOfStacks);
            tops[i] = -1;
        }
    }

    // isFull
    public boolean isFull(int stackNum) {
        return tops[stackNum-1] == (sizes[stackNum]-1);
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        return tops[stackNum-1] == -1;
    }

    // indexOfTop - this is helper method for push, pop and peek methods
    private int indexOfTop(int stackNum) {
        return tops[stackNum];
    }

    // push
    public void push(int stackNum, int value) {
        if(isFull(stackNum))
        {
            System.out.println("Queue is full");
            return;
        }else{
                if(isEmpty(stackNum))
                {
                    tops[stackNum-1] = sizes[stackNum-1];
                    values[tops[stackNum-1]] = value;
                }
                else{
                    tops[stackNum-1] = tops[stackNum-1]+1;
                    values[tops[stackNum-1]] = value;
                }
        }
    }

    // pop
    public int pop(int stackNum) {
        int res = -1;
        if(isEmpty(stackNum))
            return res;
        else{
            res = values[tops[stackNum-1]];
            tops[stackNum-1]= tops[stackNum-1] -1;
        }
        return res;
    }

    // peek
    public int peek(int stackNum) {
        if(isEmpty(stackNum))
            return -1;
        else
            return values[tops[stackNum-1]];
    }

    public void printStack(int stackNum){
        for(int i= sizes[stackNum-1];i<sizes[stackNum];i++){
            System.out.print(values[i]+" ");
        }System.out.println();

    }

}
