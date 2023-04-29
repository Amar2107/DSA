package org.example.ds.tree.heap;

public class Main {

    private static final String MIN = "min";
    private static final String MAX = "max";

    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(5);

        heap.insert(3,MIN);
        heap.insert(1,MIN);
        heap.insert(5,MIN);
        heap.insert(2,MIN);
        heap.insert(4,MIN);


        //heap.inOrder(1);
        heap.lvlOrder();
    }
}
