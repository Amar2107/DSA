package org.example.ds.stack.assignment;

import java.util.Arrays;

public class ThreeToOneMain {
    public static void main(String[] args) {
        ThreeInOne stack = new ThreeInOne(9);
        System.out.println(Arrays.toString(stack.sizes));
        System.out.println(Arrays.toString(stack.tops));

        stack.push(1,1);
        stack.push(1,2);
        stack.push(1,7);
        stack.push(2,3);
        stack.push(2,4);
        stack.push(2,8);
        stack.push(2,7);
        stack.push(3,5);
        stack.push(3,6);
        stack.push(3,9);

        stack.printStack(1);
        stack.printStack(2);
        stack.printStack(3);


        System.out.println(stack.pop(1));
        System.out.println(stack.pop(1));
        System.out.println(stack.pop(1));
        System.out.println(stack.pop(2));
        System.out.println(stack.pop(2));
        System.out.println(stack.pop(2));
        System.out.println(stack.pop(3));
        System.out.println(stack.pop(3));
        System.out.println(stack.pop(1));




    }
}
